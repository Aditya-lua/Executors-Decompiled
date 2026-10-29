/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb541f4..0xb5432c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b541f4_0 {
    char padding_0[24];
    char field_18;
    char padding_19[343];
    long long field_170;
} st_b541f4_0;


char sub_b541f4(st_b541f4_0 *a0, char a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    char v10;  // x0
    char v11;  // w0
    char v0;  // [bp-0x30]
    char v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        if (a1 && *(long long *)a1)
        {
            v2 = v7;
            v3 = v8;
            v4 = &v6;
            v5 = v9;
            v10 = sub_a6fbc4(a1, "distid");
            if (v10)
            {
                v0 = 0;
                v1 = 0;
                if (!(a0->field_18 & 1))
                    return 0;
                if (*(long long *)(v10 + 24) && !sub_a71440())
                    goto LABEL_b54318;
                sub_a6c2e4(a0->field_170, "providers/implementations/signature/sm2_sig.c", 466);
                a0->field_170 = v1;
                *(unsigned long long *)&a0[1].padding_0[0] = v0;
            }
            if (sub_a6fbc4(a1, "digest-size"))
            {
                v11 = sub_a70ef8();
                if (!v11)
                    return v11;
                if (v1 == *(long long *)&a0->padding_19[335])
                    goto LABEL_b542a8;
            }
            else
            {
LABEL_b542a8:
                if (!sub_a6fbc4(a1, "digest"))
                    return 1;
                v0 = 0;
                if (sub_a71220())
                {
                    if (sub_b54378(a0, v0))
                    {
                        sub_a6c2e4(v0, "providers/implementations/signature/sm2_sig.c", 491);
                        return 1;
                    }
                    sub_a6c2e4(v0, "providers/implementations/signature/sm2_sig.c", 488);
                }
            }
LABEL_b54318:
            return 0;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}
