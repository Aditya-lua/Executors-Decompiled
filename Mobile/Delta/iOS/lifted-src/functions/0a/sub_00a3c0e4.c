/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3c0e4..0xa3c198 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3c0e4_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[16];
    unsigned int field_1c;
    long long field_20;
} st_a3c0e4_0;


long long sub_a3c0e4(unsigned int a0, unsigned long a1, st_a3c0e4_0 *a2)
{
    long long v2;  // w0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a3bbe8();
    if (v2 < 1)
    {
        return v2;
    }
    else if (a2->field_8 != 2)
    {
LABEL_a3c184:
        return 0;
    }
    else if (a0 == 4)
    {
        v3 = sub_a3f2ec(_atoi(a2->field_20));
        a2->field_20 = v3;
        if (v3)
        {
            a2->field_1c = _strlen();
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/ctrl_params_translate.c", 1080, "fix_dh_paramgen_type");
            sub_a36abc(6, 222, 0);
            goto LABEL_a3c184;
        }
    }
}
