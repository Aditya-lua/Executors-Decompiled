/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40e40..0xa4104c (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void* sub_a40e40(void* a0, unsigned int a1, void* a2, long long a3)
{
    void* v8;  // x8
    long long v9;  // x1
    void* v10;  // x8
    void* v11;  // x9
    void* v12;  // x9
    void* v13;  // x9
    void* v0;  // [bp-0x80]
    void* v1;  // [bp-0x70]
    void* v2;  // [bp-0x60]
    void* v3;  // [bp-0x50]
    void* v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v3 = (void*)0;
    v4 = (void*)0;
    v1 = (void*)0;
    v2 = (void*)0;
    v0 = (void*)0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 896, "EVP_MD_CTX_ctrl");
        v9 = 786690;
        goto LABEL_a40ee8;
    }
    v8 = (long long)a0[8];
    if (!v8 || (long long)v8[112])
    {
        switch (a1)
        {
        case 2:
            sub_a71618();
            v13 = (long long)a0[40];
            if (v13 && (*(int *)v13 == 0x100 || *(int *)v13 == 128) && (long long)v13[48] && *(long long *)((long long)v13[40] + 0x100))
                (*(long long *)((long long)v13[40] + 0x100))();
            if ((long long)a0[8] && (v12 = *(long long *)((long long)a0[8] + 216), *(long long *)((long long)a0[8] + 216)))
            {
LABEL_a41008:
                v12();
            }
            break;
        case 29:
            sub_a71670("ssl3-ms", a3, a2);
LABEL_a40f50:
            v10 = a0;
            v11 = (long long)a0[40];
            if (v11 && (*(int *)v11 == 0x100 || *(int *)v11 == 128) && (long long)v11[48] && *(long long *)((long long)v11[40] + 272))
                (*(long long *)((long long)v11[40] + 272))();
            if ((long long)v10[8] && (v12 = *(long long *)((long long)v10[8] + 208), *(long long *)((long long)v10[8] + 208)))
                goto LABEL_a41008;
            break;
        case 3:
            sub_a70ed8("xoflen", &(long long)a2);
            goto LABEL_a40f50;
        default:
            break;
        }
    }
    else
    {
        if ((long long)v8[80])
            (long long)v8[80]();
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 930, "EVP_MD_CTX_ctrl");
        v9 = 132;
LABEL_a40ee8:
        sub_a36abc(6, v9, 0);
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
