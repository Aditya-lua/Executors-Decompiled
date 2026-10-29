/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c45c4..0x9c478c (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_9c47c8;
extern long long g_9c47d8;
extern long long g_d2c230;
extern long long g_f12798;

unsigned long long sub_9c45c4(unsigned int a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v3;  // x0
    unsigned long long idx;  // x25
    void* v5;  // x24
    unsigned long long v6;  // x0
    unsigned long long v7;  // x9
    unsigned int v0;  // [bp-0x78]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!g_f12798 && (g_f12798 = sub_ad6270(&g_9c47d8), !g_f12798))
    {
LABEL_9c4720:
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_strnid.c", 195, "ASN1_STRING_TABLE_add");
        sub_a36abc(13, 0x8000d, 0);
        return 0;
    }
    sub_a6afb8(64, 0);
    v0 = a0;
    if (g_f12798)
    {
        sub_ad6ae4(g_f12798);
        v3 = sub_ad66d4(g_f12798, &v0);
        if (v3 >> 31 & 1)
            goto LABEL_9c4658;
        idx = sub_ad69f8(g_f12798, v3);
        if (idx)
            goto LABEL_9c4680;
    }
    else
    {
LABEL_9c4658:
        idx = sub_a99ef4(&v0, &g_d2c230, 28, 40, &g_9c47c8);
        if (idx)
        {
LABEL_9c4680:
            if (*(char *)(idx + 32) & 1)
            {
                v5 = idx;
                if ((long long)a1 >= 0)
                    goto LABEL_9c46e4;
LABEL_9c46e8:
                if ((long long)a2 >= 0)
                    *(unsigned long long *)&v5[16] = a2;
                if (a3)
                    *(unsigned long long *)&v5[24] = a3;
                if (!a4)
                    return 1;
                *(unsigned long long *)&v5[32] = a4 | 1;
                return 1;
            }
        }
    }
    v6 = sub_a6bffc(40, "crypto/asn1/a_strnid.c", 166);
    if (!v6)
        goto LABEL_9c4720;
    v5 = v6;
    if (!sub_ad68a0(g_f12798, v5))
    {
        sub_a6c2e4(v5, "crypto/asn1/a_strnid.c", 169);
        goto LABEL_9c4720;
    }
    if (idx)
    {
        *(int *)v5 = *(int *)idx;
        *(int128_t *)&v5[8] = *(int128_t *)(idx + 8);
        v7 = *(long long *)(idx + 32) | 1;
        *(long long *)&v5[24] = *(long long *)(idx + 24);
        *(unsigned long long *)&v5[32] = v7;
        if ((long long)a1 >= 0)
            goto LABEL_9c46e4;
        goto LABEL_9c46e8;
    }
    else
    {
        *(unsigned int *)v5 = a0;
        *(unsigned long *)&v5[8] = 0xffffffffffffffff;
        *(unsigned long long *)&v5[16] = 0xffffffffffffffff;
        *(unsigned long long *)&v5[32] = 1;
        if ((long long)a1 >= 0)
        {
LABEL_9c46e4:
            *(unsigned long long *)&v5[8] = a1;
            goto LABEL_9c46e8;
        }
    }
}
