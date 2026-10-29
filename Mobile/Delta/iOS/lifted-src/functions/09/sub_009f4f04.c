/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4f04..0x9f4f54 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4f04_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_9f4f04_0;


st_9f4f04_0 ** sub_9f4f04(st_9f4f04_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_lib.c", 254, "NCONF_load");
        sub_a36abc(14, 105, 0);
        return 0;
    }
    goto *((void *)(*a0->field_48));
}
