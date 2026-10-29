/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ccf8..0xb3cef8 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3ccf8_0 {
    long long field_0;
    long long field_8;
    char padding_10[4];
    char field_14;
} st_b3ccf8_0;


st_b3ccf8_0 * sub_b3ccf8(st_b3ccf8_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    char v17;  // w0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    char idx;  // x0
    char v13;  // x19
    char v14;  // x0
    char *v15;  // x20
    char v16;  // w8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    idx = sub_a2a7c8(a0->field_0, (unsigned long long)a0->padding_10, 0, a0->field_8);
    if (!idx)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/ecx_kmgmt.c", 705, "ecx_gen");
        sub_a36abc(57, 0x80010, 0);
        idx = 0;
    }
    else if (a0->field_14 & 3)
    {
        v13 = idx;
        v14 = sub_a2a950();
        if (v14)
        {
            v15 = (char *)v14;
            if (*(long long *)((char *)&a0[1].field_0 + 3) && *(long long *)((char *)&a0[1].field_8 + 3))
            {
                idx = v13;
                if ((a0->padding_10 & 0xfffffffe) != 2 && !(idx = v13, !sub_b35f80(v13, v15)))
                    goto LABEL_b3cde0;
                goto LABEL_b3ce58;
            }
            idx = v13;
            if ((int)sub_aa845c(a0->field_0, v15, *(long long *)(v13 + 88), 0) < 1)
                goto LABEL_b3ce58;
LABEL_b3cde0:
            v16 = (char)a0->padding_10;
            if (1 >= v16)
            {
                if (!v16)
                {
                    *v15 = *v15 & 248;
                    v15[31] = 64 | (64 | v15[31] & 63) & 63;
                    sub_a0fdb8(v13 + 0x11, v15);
                    idx = v13;
                    goto LABEL_b3cedc;
                }
                else if (v16 == 1)
                {
                    *v15 = *v15 & 252;
                    v15[55] = v15[55] | 128;
                    sub_a07c88(v13 + 0x11, v15);
                    idx = v13;
                    goto LABEL_b3cedc;
                }
            }
            if (v16 != 2)
            {
                if (v16 == 3)
                {
                    v17 = sub_a084f8(a0->field_0, idx + 0x11, v15, a0->field_8);
                    goto LABEL_b3ced0;
                }
LABEL_b3cedc:
                *(char *)(idx + 16) = *(char *)(idx + 16) | 1;
            }
            else
            {
                v17 = sub_a0d9ac(a0->field_0, idx + 0x11, v15, a0->field_8);
LABEL_b3ced0:
                idx = v13;
                if (v17)
                    goto LABEL_b3cedc;
LABEL_b3ce58:
                sub_a2a8a4(idx);
                idx = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/ecx_kmgmt.c", 714, "ecx_gen");
            sub_a36abc(57, 0x80010, 0);
            idx = v13;
            goto LABEL_b3ce58;
        }
    }
    return idx;
}
