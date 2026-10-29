/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b850..0xb5b898 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b850_0 {
    char padding_0[120];
    struct st_b5b850_0 *field_78;
    struct st_b5b850_0 *field_80;
} st_b5b850_0;


st_b5b850_0 * sub_b5b850(st_b5b850_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b5b850_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if ((int)a0->field_80)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a6c2e4(a0->field_78, "providers/implementations/ciphers/ciphercommon.c", 183);
        *(unsigned int *)&a0->field_80 = 0;
        a0->field_78 = 0;
        return v8;
    }
    else
    {
        return a0;
    }
}
