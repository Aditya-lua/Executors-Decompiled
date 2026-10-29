/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5bd4..0x1a5c84 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5bd4_0 {
    char padding_0[8];
    long long field_8;
} st_1a5bd4_0;


st_1a5bd4_0 * sub_1a5bd4(long long a0)
{
    st_1a5bd4_0 *v3;  // x19
    long long v4;  // x0
    long long v5;  // x1
    st_1a5bd4_0 *v0;  // [bp-0x48], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_1c5b94();
    v3 = v0;
    v4 = sub_a0c8(v3 + 1);
    v5 = sub_1a5cdc(a0, v4, sub_6b08(v3 + 1), 0);
    v3->field_8 = v5;
    sub_1b08ec(a0, v3, sub_1aa9f4(a0, v5, v3 + 1));
    v0 = 0;
    sub_1adcd8(&v0, 0);
    return v3;
}
