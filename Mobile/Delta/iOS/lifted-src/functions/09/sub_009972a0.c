/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9972a0..0x9973a0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9972a0_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[62];
    char field_52;
    char padding_53[1613];
    char field_6a0;
    char padding_6a1[7];
    unsigned long long field_6a8;
    unsigned long long field_6b0;
} st_9972a0_0;


unsigned long long sub_9972a0(st_9972a0_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x8
    unsigned long long v11;  // x9
    unsigned long long v12;  // x8
    char v13;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (*(long long *)&a0->field_6a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = 13;
    if (!a0->field_10)
        v8 = 5;
    v9 = v8 + *(int *)&a0[2].padding_53[649] + 320;
    if (a0->field_52 >> 1 & 1)
    {
        v10 = v9 + 7;
    }
    else if (*(long long *)&a0[2].padding_53[869])
    {
        (*(long long *)&a0[2].padding_53[869])();
    }
    else
    {
        v10 = v9 + 1031;
    }
    v11 = *(long long *)&a0[2].padding_53[885];
    if (1 >= (unsigned long long)*(long long *)&a0[2].padding_53[885])
        v11 = 1;
    v12 = v10 * v11;
    if (v12 < a0->field_6a8)
        v12 = a0->field_6a8;
    v13 = sub_a6bf4c();
    if (!v13)
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 267, "tls_setup_read_buffer");
        sub_996e84(a0, 0xffffffff, 0x8000f, 0);
        return 0;
    }
    *(unsigned long long *)&a0->field_6a0 = v13;
    a0->field_6b0 = v12;
    return 1;
}
