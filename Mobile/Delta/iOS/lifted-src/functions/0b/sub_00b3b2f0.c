/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3b2f0..0xb3b3f0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3b2f0_0 {
    long long field_0;
    char padding_8[112];
    char field_78;
} st_b3b2f0_0;


st_b3b2f0_0 * sub_b3b2f0(st_b3b2f0_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    char v11;  // w0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a18b7c(a0->field_0, 0);
    if (v8)
    {
        v8 = v8;
        if (!*(long long *)((char *)&a0[1].field_0 + 7))
        {
            if (sub_b3b5a4(a0))
                goto LABEL_b3b368;
            goto LABEL_b3b3c8;
        }
        if (*(long long *)&a0->padding_8[8])
        {
            v9 = sub_a16b98(*(long long *)&a0->padding_8[8]);
            if (!(v9 >> 31 & 1))
            {
                sub_319f0(*(long long *)((char *)&a0[1].field_0 + 7), v9);
                goto LABEL_b3b33c;
            }
            goto LABEL_b3b3c8;
        }
LABEL_b3b33c:
        if (!*(long long *)&a0->padding_8[16])
            goto LABEL_b3b368;
        v10 = sub_a16d00(*(long long *)&a0->padding_8[16]);
        if (v10 >> 31 & 1)
            goto LABEL_b3b3c8;
        sub_986440(*(long long *)((char *)&a0[1].field_0 + 7), v10);
LABEL_b3b368:
        if (*(long long *)((char *)&a0[1].field_0 + 7))
        {
            v11 = sub_a19718(v8);
            if (a0->field_78 & 3)
            {
                if (v11 >= 1 && sub_a18d10(v8))
                    goto LABEL_b3b3e8;
                goto LABEL_b3b3c8;
            }
            else
            {
                if (v11 <= 0)
                    goto LABEL_b3b3c8;
LABEL_b3b3e8:
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/ec_kmgmt.c", 1237, "ec_gen_assign_group");
            sub_a36abc(57, 177, 0);
LABEL_b3b3c8:
            sub_a18c08(v8);
            v8 = 0;
        }
    }
    return v8;
}
