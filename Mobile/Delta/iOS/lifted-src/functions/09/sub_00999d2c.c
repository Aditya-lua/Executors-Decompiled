/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x999d2c..0x999e08 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_999d2c(long long a0)
{
    long long idx;  // x8
    unsigned long v6;  // x9
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long v7;  // x9
    unsigned long v8;  // x9
    unsigned long v9;  // x9
    unsigned long v10;  // x9
    unsigned long v11;  // x9
    unsigned long v12;  // x9
    unsigned long v13;  // x9
    unsigned long long v14;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    idx = a0 + 0x1000;
    v6 = *(char *)(idx + 7) + 1;
    *(char *)(idx + 7) = v6;
    if (!(v6 >> 8 & 1))
        return 1;
    v7 = *(char *)(idx + 6) + 1;
    *(char *)(idx + 6) = v7;
    if (!(v7 >> 8 & 1))
        return 1;
    v8 = *(char *)(idx + 5) + 1;
    *(char *)(idx + 5) = v8;
    if (!(v8 >> 8 & 1))
        return 1;
    v9 = *(char *)(idx + 4) + 1;
    *(char *)(idx + 4) = v9;
    if (!(v9 >> 8 & 1))
        return 1;
    v10 = *(char *)(idx + 3) + 1;
    *(char *)(idx + 3) = v10;
    if (!(v10 >> 8 & 1))
        return 1;
    v11 = *(char *)(idx + 2) + 1;
    *(char *)(idx + 2) = v11;
    if (!(v11 >> 8 & 1))
        return 1;
    v12 = *(char *)(idx + 1) + 1;
    *(char *)(idx + 1) = v12;
    if (!(v12 >> 8 & 1))
        return 1;
    v13 = *(char *)idx + 1;
    *(char *)idx = v13;
    if (!(v13 >> 8 & 1))
        return 1;
    v0 = v14;
    v1 = v15;
    v2 = &v4;
    v3 = v16;
    sub_a368c8();
    sub_a369bc("ssl/record/methods/tls_common.c", 2132, "tls_increment_sequence_ctr");
    sub_996e84(a0, 80, 327, 0);
    return 0;
}
