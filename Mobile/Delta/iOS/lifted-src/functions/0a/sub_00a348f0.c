/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa348f0..0xa34a44 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a348f0_0 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char padding_11[7];
    unsigned long long field_18;
} st_a348f0_0;

extern long long g_f0d560;
extern char g_f12870;

char sub_a348f0(unsigned long a0, unsigned int a1)
{
    char v2;  // x0
    st_a348f0_0 *v3;  // x19
    char v4;  // x20
    unsigned long long v5;  // x21
    unsigned long v6;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6afb8(64, 0);
    if (!*(long long *)a0 || !sub_a7c198(g_f0d560))
        return 0;
    sub_a36c8c();
    if (*(long long *)a0 && !(v2 = sub_a66b6c(*(long long *)a0, &/* unsupported instruction */), !v2))
    {
        v3 = (st_a348f0_0 *)v2;
        if (*(long long *)(v2 + 16) && sub_a32c08(*(long long *)(v2 + 16)) || (int)v3->field_18)
        {
            v4 = *(long long *)&v3->field_10;
        }
        else
        {
            v4 = sub_ad69f8(v3->field_8, 0);
            if (v4)
            {
                v5 = 1;
                do
                {
                    if ((0 < *(int *)(v4 + 160) || !(g_f12870 & 1)) && sub_a32c08(v4) && *(long long *)&v3->field_10 != v4 && sub_a32c08(v4))
                    {
                        if (*(long long *)&v3->field_10)
                            sub_a32c78(*(long long *)&v3->field_10, 0);
                        *(unsigned long long *)&v3->field_10 = v4;
                        break;
                    }
                } while ((v6 = (unsigned int)v5 + 1, v4 = sub_ad69f8(v3->field_8, v5), v5 = (unsigned int)v5 + 1, v4));
            }
        }
        *(unsigned int *)&v3->field_18 = 1;
    }
    else
    {
        v4 = 0;
    }
    sub_a36cd4(sub_a7c1b4(g_f0d560));
    return v4;
    return 0;
}
