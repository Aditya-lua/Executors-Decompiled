/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1de9c..0xa1df70 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1de9c_0 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    struct st_a1de9c_1 *field_98;
} st_a1de9c_0;

typedef struct st_a1de9c_1 {
    long long field_0;
} st_a1de9c_1;


long long sub_a1de9c(st_a1de9c_0 *a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_88 && !*(long long *)a0->field_98)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_pmeth.c", 443, "pkey_ec_keygen");
        sub_a36abc(16, 139, 0);
        return 0;
    }
    v2 = sub_a18b6c();
    if (!v2)
        return 0;
    v3 = v2;
    if (!sub_a5ab14(a1, 408, v3))
    {
        sub_a18c08(v3);
        return 0;
    }
    else if (a0->field_88)
    {
        if (!sub_a59d8c(a1))
            return 0;
    }
    else
    {
        if (!sub_a19718(v3, *(long long *)a0->field_98))
            return 0;
    }
}
