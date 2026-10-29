/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6404..0x9e6528 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e6404_0 {
    char padding_0[16];
    long long field_10;
} st_9e6404_0;

extern unsigned long long g_9db29c;
extern unsigned long long g_9db58c;

long long sub_9e6404(st_9e6404_0 *a0, unsigned long a1, unsigned long a2, st_9e6404_0 *a3, long long a4)
{
    long long v2;  // x0
    unsigned long long *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a4);
    v2 = sub_9de208(a4);
    if (v2)
    {
        if (a1 != a2)
        {
            if (sub_9e7dc8())
                goto LABEL_9e6470;
        }
        else
        {
            if (sub_9eac28())
            {
LABEL_9e6470:
                if (a0 == a3)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/bn/bn_mod.c", 22, "BN_nnmod");
                    sub_a36abc(3, 0x80106, 0);
                }
                else if (sub_9de520(0, a0, v2, a3, a4))
                {
                    if ((int)a0->field_10)
                    {
                        if (!(int)a3->field_10)
                            v3 = &g_9db29c;
                        else
                            v3 = &g_9db58c;
                        v3();
                    }
                    else
                    {
                        sub_9de17c(a4);
                        return 1;
                    }
                }
            }
        }
    }
    sub_9de17c(a4);
    return 0;
}
