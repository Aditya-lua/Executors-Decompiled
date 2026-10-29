/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cc2f8..0x9cc568 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9cc2f8(unsigned int a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned long long *a5, unsigned int a6, unsigned long long a7, unsigned long a8, unsigned int idx)
{
    unsigned long v5;  // x28
    unsigned long v6;  // x0
    unsigned int v7;  // w9
    long long v8;  // x1
    unsigned long v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x68]
    unsigned int v3;  // [bp-0x64]
    char *v4;  // [bp-0x10]

    v4 = &a8;
    v5 = *a5;
    v0 = v5;
    if (a6 > 0)
    {
        if (!idx)
        {
            v6 = sub_9c7328(&v0, &v1, &v3, &v2, a6);
        }
        else if (*(char *)idx)
        {
            v6 = *(int *)(idx + 4);
            v2 = *(int *)(idx + 20);
            v3 = *(int *)(idx + 16);
            v0 = v5 + *(int *)(idx + 24);
            v1 = *(long long *)(idx + 8);
        }
        else
        {
            v6 = sub_9c7328(&v0, &v1, &v3, &v2, a6);
            *(unsigned int *)(idx + 4) = v6;
            *(unsigned long *)(idx + 8) = v1;
            *(unsigned int *)(idx + 16) = v3;
            *(unsigned int *)(idx + 20) = v2;
            v7 = v0 - v5;
            *(unsigned int *)(idx + 24) = v7;
            *(char *)idx = 1;
            if (!((unsigned int)v6 & 129) && (long long)(v1 + v7) > a6)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 1214, "asn1_check_tlen");
                sub_a36abc(13, 155, 0);
                *(char *)idx = 0;
                return 0;
            }
        }
        if (v6 >> 7 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/tasn_dec.c", 1221, "asn1_check_tlen");
            v8 = 0x66;
        }
        else if (a7 >> 31 & 1)
        {
LABEL_9cc470:
            if (v6 & 1)
                v1 = v5 + a6 - v0;
            if (a3)
                *(char *)a3 = (char)v6 & 1;
            if (a4)
                *(char *)a4 = (char)v6 & 32;
            if (a0)
                *(unsigned long *)a0 = v1;
            if (a2)
                *(char *)a2 = v2;
            if (a1)
                *(unsigned int *)a1 = v3;
            *a5 = v0;
            return 1;
        }
        else if (v3 != (unsigned int)a7 || v2 != (unsigned int)a8)
        {
            if (*(char *)((void*)&a8 + 4))
                return 0xffffffff;
            sub_a368c8();
            sub_a369bc("crypto/asn1/tasn_dec.c", 1231, "asn1_check_tlen");
            v8 = 168;
        }
        else if (idx)
        {
            *(char *)idx = 0;
            goto LABEL_9cc470;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 1191, "asn1_check_tlen");
        v8 = 224;
    }
    sub_a36abc(13, v8, 0);
    if (!idx)
        return 0;
    *(char *)idx = 0;
    return 0;
}
