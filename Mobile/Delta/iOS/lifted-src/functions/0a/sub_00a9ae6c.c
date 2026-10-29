/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9ae6c..0xa9afb8 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a9b230;
extern long long g_a9b240;
extern long long g_df68b0;
extern long long g_f09048;
extern long long g_f12f38;
extern char g_f12f48;
extern char g_f12f50;

int sub_a9ae6c(unsigned long long a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long idx;  // x0
    unsigned long long v17;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if ((unsigned int)a0)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        idx = sub_a99ef4(&(unsigned int)a0, &g_df68b0, 0x44, 12, &g_a9b230);
        if (idx)
        {
LABEL_a9aebc:
            if (a1)
                *(int *)a1 = *(int *)(idx + 4);
            if (a2)
                *(int *)a2 = *(int *)(idx + 8);
            idx = 1;
        }
        else
        {
            idx = 0;
            if (sub_a7c208(&g_f09048, &g_a9b240) && *(int *)&g_f12f50)
            {
                if (!a3 || sub_a7c17c(g_f12f38))
                {
                    idx = *(long long *)&g_f12f48;
                    if (*(long long *)&g_f12f48)
                    {
                        v17 = sub_ad66d4(*(long long *)&g_f12f48, &(unsigned int)a0);
                        if (!(v17 >> 31 & 1))
                        {
                            idx = sub_ad69f8(*(long long *)&g_f12f48, v17);
                            goto LABEL_a9af54;
                        }
                        else
                        {
                            idx = 0;
                            if (a3)
                            {
LABEL_a9af58:
                                sub_a7c1b4(g_f12f38);
                            }
                        }
                    }
                    else
                    {
LABEL_a9af54:
                        if (a3)
                            goto LABEL_a9af58;
                    }
                    if (idx)
                        goto LABEL_a9aebc;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/objects/obj_xref.c", 82, "ossl_obj_find_sigid_algs");
                    sub_a36abc(8, 0xc010f, 0);
                    idx = 0;
                }
            }
        }
        a0 = idx;
    }
    return a0;
}
