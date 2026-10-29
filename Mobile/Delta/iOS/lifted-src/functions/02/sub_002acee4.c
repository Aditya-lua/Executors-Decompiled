/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2acee4..0x2ad000 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2acee4_1 {
    struct st_2acee4_0 *field_0;
} st_2acee4_1;

typedef struct st_2acee4_0 {
    char field_0;
} st_2acee4_0;


long long sub_2acee4(void* a0, char *a1)
{
    long long v11;  // x0
    unsigned long v12;  // x23
    long long v13;  // x20
    long long v14;  // x8
    unsigned long v15;  // x9
    uint128_t v0;  // [bp-0xa0]
    st_2acee4_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_2acee4_0 *v2;  // [bp-0x80]
    char v3;  // [bp-0x78], Other Possible Types: long long
    long long v4;  // [bp-0x70]
    void* idx;  // [bp-0x68], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x60]
    st_2acee4_0 *v7;  // [bp-0x50], Other Possible Types: st_2acee4_1 **
    st_2acee4_0 **v8;  // [bp-0x48], Other Possible Types: st_2acee4_1 **, char
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_20b20();
    sub_1b298(&v3, v11, (long long)a0[8] - *(long long *)a0 >> 4, a0);
    *(unsigned long long *)&idx[8] = 0;
    *(unsigned long long *)idx = 0;
    v12 = *a1;
    v7 = &v8;
    v8 = &v7;
    sub_2a6e94(idx + 8, 0);
    *(char *)idx = 4;
    *(unsigned long *)&idx[8] = v12;
    idx = _INSERT(CONCAT(idx, 0), 0, idx + 16);
    v7 = &v8;
    v8 = &v7;
    v13 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_2aa9a0(a0, *(long long *)a0, (long long)a0[8], v13);
    v14 = *(long long *)a0;
    *(long long *)a0 = v13;
    v15 = (long long)a0[16];
    v0 = idx;
    *(uint128_t *)&a0[8] = idx;
    idx = v14;
    v6 = v15;
    v3 = v14;
    v4 = v14;
    sub_2b0718(&v3);
    return (unsigned long long)v0;
}
