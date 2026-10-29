/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36180..0xb36228 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b36180_0 {
    long long field_0;
    char padding_8[28];
    unsigned int field_24;
    char padding_28[16];
    unsigned long long field_38;
    long long field_40;
} st_b36180_0;

typedef struct st_b36180_1 {
    char padding_0[96];
    unsigned int field_60;
} st_b36180_1;


unsigned long long sub_b36180(st_b36180_0 *a0, st_b36180_1 *a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    sub_a2a8a4(a0->field_0);
    a0->field_0 = 0;
    v3 = sub_a646b8();
    a0->field_40 = v3;
    if (!v3)
        return 0xfffffffe;
    a0->field_38 = "HKDF";
    v4 = sub_a2a930(a1);
    if (!(unsigned int)v4)
        return v4;
    a0->field_0 = a1;
    a0->field_24 = 0x1000;
}
