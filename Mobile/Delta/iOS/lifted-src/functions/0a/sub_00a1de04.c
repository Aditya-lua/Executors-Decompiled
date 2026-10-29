/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1de04..0xa1de9c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1de04_0 {
    char padding_0[152];
    struct st_a1de04_1 *field_98;
} st_a1de04_0;

typedef struct st_a1de04_1 {
    unsigned long long field_0;
} st_a1de04_1;


unsigned long long sub_a1de04(st_a1de04_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x19
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)a0->field_98)
    {
        v2 = sub_a18b6c();
        if (!v2)
            return v2;
        v3 = v2;
        if (sub_a19718())
        {
            v4 = sub_a5ab14(a1, 408, v3);
            if ((unsigned int)v4)
                return v4;
        }
        sub_a18c08(v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_pmeth.c", 424, "pkey_ec_paramgen");
        sub_a36abc(16, 139, 0);
    }
    return 0;
}
