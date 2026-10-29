/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb54378..0xb54464 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b54378_0 {
    long long field_0;
    long long field_8;
    char padding_10[9];
    char field_19;
    char padding_1a[318];
    long long field_158;
} st_b54378_0;


long long sub_b54378(st_b54378_0 *a0, long long a1)
{
    long long v3;  // x0
    long long v4;  // x1
    long long v5;  // x2
    long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_158;
    if (!v3)
    {
        v3 = sub_a40ca8(a0->field_0, &a0->field_19, a0->field_8);
        a0->field_158 = v3;
        if (!v3)
            return v3;
    }
    if (sub_a50b14(v3))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/sm2_sig.c", 0x66, "sm2sig_set_mdname");
        v4 = 183;
        v5 = 0;
    }
    else if (a1)
    {
        if (49 >= _strlen(a1) && sub_a509f4(a0->field_158, a1))
        {
            sub_a6db20(&a0->field_19, a1, 50);
            return 1;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/sm2_sig.c", 111, "sm2sig_set_mdname");
        v0 = a1;
        v5 = "digest=%s";
        v4 = 122;
    }
    else
    {
        return 1;
    }
    sub_a36abc(57, v4, v5);
    return 0;
}
