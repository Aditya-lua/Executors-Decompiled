/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0baac..0xb0bb8c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0baac_0 {
    char padding_0[108];
    char field_6c;
} st_b0baac_0;


long long sub_b0baac(st_b0baac_0 *a0, char *a1, char *a2, unsigned long i)
{
    unsigned long long v5;  // x9
    unsigned long v6;  // x23
    unsigned long long v7;  // x25
    char v8;  // x26
    long long v0;  // [bp-0x60]
    char v1;  // [bp-0x52]
    char v2;  // [bp-0x51]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v5 = i * 8;
    if ((char)a0->field_6c >= 0)
        i = v5;
    if (!i)
        return 1;
    v6 = 0;
    do
    {
        v7 = v6 >> 3;
        v8 = (char)v6 & 7;
        v2 = (a2[v7] >> ((v8 ^ 7) & 31)) * 128;
        *(unsigned int *)&v0 = __ROL__(a0->field_6c, 31) & 0x80000001 & 1;
        sub_9f8794(&v2, &v1, 1, 1, &a0[1].padding_0[83], &a0[2].padding_0[0x66], &a0[4].padding_0[12], &a0->padding_0[32], v0);
        a1[v7] = (v1 & 128) >> (v8 & 31) | (char)(-0x81 >> (v8 & 31)) & a1[v7];
        v6 += 1;
    } while (i != v6);
    return 1;
}
