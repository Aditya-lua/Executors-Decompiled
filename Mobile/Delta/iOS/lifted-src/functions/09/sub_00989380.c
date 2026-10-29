/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989380..0x989488 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989380_0 {
    long long field_0;
    char padding_8[128];
    unsigned int field_88;
} st_989380_0;


unsigned int sub_989380(st_989380_0 *a0, unsigned long long a1, unsigned int a2)
{
    unsigned int idx;  // x0
    unsigned long v5;  // x9
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    char v0;  // [bp-0x138]
    unsigned long long v1;  // [bp-0x100]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    if (sub_a66b6c(a0->field_0, &v0))
        return 0;
    idx = sub_a6bffc(264, "ssl/quic/quic_stream_map.c", 152);
    if (!idx)
        return idx;
    *(unsigned long long *)(idx + 56) = a1;
    v5 = a0->field_88;
    v6 = (*(long long *)(idx + 0x100) & 0xffffffffffffff00 & 0xfffffffffdffffff | a2 & 0xff) & 0xfffffffffc000000 | ((*(long long *)(idx + 0x100) & 0xffffffffffffff00 & 0xfffffffffdffffff | a2 & 0xff) & 0xfffffffffdffffff | (v5 * 0x2000000 | v5 >> 39) & 0x2000000) & 0x3ffffff;
    if (!(v6 & 1 ^ (unsigned int)v6 >> 25 & 1))
        v7 = 0x100;
    else
        v7 = 0x100 & ~(a2 * 128);
    v8 = v6 & 0xffffffffffff00ff | v7;
    if (!(v8 & 1 ^ (unsigned int)v8 >> 25 & 1))
        v9 = 0x10000 & ~(a2 * 0x8000);
    else
        v9 = 0x10000;
    *(unsigned long long *)(idx + 0x100) = v8 & 0xffffffffff0001ff | v9;
    *(unsigned long *)(idx + 104) = 0xffffffffffffffff;
    sub_a66794();
    if (!sub_a66e38(a0->field_0))
        return idx;
    sub_a6c2e4(idx, "ssl/quic/quic_stream_map.c", 172);
    return 0;
}
