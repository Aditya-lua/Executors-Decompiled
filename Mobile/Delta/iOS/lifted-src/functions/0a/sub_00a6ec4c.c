/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ec4c..0xa6ed4c (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ec4c_0 {
    char padding_0[16];
    unsigned long long field_10[2];
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    char field_30;
} st_a6ec4c_0;


unsigned long long sub_a6ec4c(st_a6ec4c_0 *a0, long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long idx;  // x0
    unsigned long long v4;  // x8
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0->padding_20 || a3 && (char)a0->field_28 & 1 || !(idx = sub_a6bffc(40, "crypto/packet.c", 380), idx))
        return 0;
    *(char [8])idx = a0->padding_20;
    *(unsigned long long *)a0->padding_20 = idx;
    v4 = a0->field_10[1];
    *(unsigned long long *)(idx + 16) = a3;
    *(unsigned long long *)(idx + 24) = v4 + a3;
    if (!a3)
    {
        *(unsigned long long *)(idx + 8) = 0;
LABEL_a6ecc0:
        if (a0->padding_20 && *(long long *)a0->padding_20 && sub_c68a50(a0))
            return 1;
    }
    else
    {
        *(unsigned long long *)(idx + 8) = v4;
        if (sub_c68684(a0, a3, &v0) && !(*(__m128i *)a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(a3, a3)), a2 && sub_c68ef8(a0, a2, &v0, a1) & 1))
            goto LABEL_a6ecc0;
    }
    return 0;
}
