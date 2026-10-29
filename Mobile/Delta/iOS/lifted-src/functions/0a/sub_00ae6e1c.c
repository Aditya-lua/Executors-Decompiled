/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae6e1c..0xae702c (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aef19c;
extern unsigned int g_eb6e08;
extern unsigned int g_eb6e20;
extern unsigned int g_eb6e38;
extern unsigned int g_eb6e50;
extern unsigned int g_eb6e68;
extern unsigned int g_eb6e80;
extern unsigned int g_eb6e98;
extern unsigned int g_eb6eb0;
extern unsigned int g_eb6ec8;

unsigned long long sub_ae6e1c(unsigned long long *a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x19
    unsigned long long v4;  // x21
    unsigned long v5;  // x27
    unsigned long long v6;  // x28
    unsigned int *v7;  // x8
    unsigned long long v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aef8d8(a1);
    if (!v2)
        return 0;
    v3 = v2;
    if (*a0)
    {
LABEL_ae6e54:
        v8 = 0;
    }
    else
    {
        if ((int)sub_ad69e4(v3) >= 1)
        {
            v4 = 0;
            do
            {
                v5 = *(long long *)(sub_ad69f8(v3, v4) + 8);
                v6 = *a0;
                if (!v6 && (v6 = sub_9cf14c(), *a0 = v6, !v6))
                    goto LABEL_ae6e54;
                if (!_strcmp("unused", v5))
                {
                    v7 = &g_eb6e08;
                }
                else if (!_strcmp("keyCompromise", v5))
                {
                    v7 = &g_eb6e20;
                }
                else if (!_strcmp("CACompromise", v5))
                {
                    v7 = &g_eb6e38;
                }
                else if (!_strcmp("affiliationChanged", v5))
                {
                    v7 = &g_eb6e50;
                }
                else if (!_strcmp("superseded", v5))
                {
                    v7 = &g_eb6e68;
                }
                else if (!_strcmp("cessationOfOperation", v5))
                {
                    v7 = &g_eb6e80;
                }
                else if (!_strcmp("certificateHold", v5))
                {
                    v7 = &g_eb6e98;
                }
                else if (_strcmp("privilegeWithdrawn", v5))
                {
                    v7 = &g_eb6ec8;
                    if (!_strcmp("AACompromise", v5))
                        goto LABEL_ae6fd0;
                    else
                        goto LABEL_ae6e54;
                }
                else
                {
                    v7 = &g_eb6eb0;
                }
LABEL_ae6fd0:
                if (!sub_9c0540(v6, *v7, 1))
                    goto LABEL_ae6e54;
            } while ((v4 = (unsigned int)v4 + 1, (int)v4 < (int)sub_ad69e4(v3)));
        }
        v8 = 1;
    }
    sub_ad6958(v3, &g_aef19c);
    return v8;
}
