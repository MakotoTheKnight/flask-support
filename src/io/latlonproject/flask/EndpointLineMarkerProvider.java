package io.latlonproject.flask;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.psi.PsiElement;
import com.jetbrains.python.psi.PyCallExpression;
import com.jetbrains.python.psi.PyDecorator;
import com.jetbrains.python.psi.PyTargetExpression;
import com.jetbrains.python.psi.impl.stubs.PyTargetExpressionElementType;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class EndpointLineMarkerProvider extends RelatedItemLineMarkerProvider {
    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element, Collection<? super RelatedItemLineMarkerInfo> result) {
        if (element instanceof PyDecorator) {
            System.out.println(((PyDecorator) element).getQualifiedName());
            super.collectNavigationMarkers(element, result);
        }
    }
}
