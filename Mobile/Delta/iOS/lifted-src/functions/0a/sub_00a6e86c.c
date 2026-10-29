/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e86c..0xa6e970 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e86c_0 {
    char padding_0[16];
    unsigned long long field_10[2];
    char field_18;
    char padding_19[15];
    char field_28;
    char padding_29[7];
    char field_30;
} st_a6e86c_0;


unsigned long long sub_a6e86c(st_a6e86c_0 *a0, long long a1, long long a2, char a3)
{
    char idx;  // x0
    char v4;  // x8
    unsigned long long v5;  // x0
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!*(long long *)&a0->padding_19[7] || a3 && a0->field_28 & 1 || !(idx = sub_a6bffc(40, "crypto/packet.c", 380), idx))
        return 0;
    *(long long *)idx = *(long long *)&a0->padding_19[7];
    *(unsigned long long *)&a0->padding_19[7] = idx;
    v4 = a0->field_10[1];
    *(unsigned long long *)(idx + 16) = a3;
    *(unsigned long long *)(idx + 24) = v4 + a3;
    if (!a3)
    {
        *(unsigned long long *)(idx + 8) = 0;
        goto LABEL_a6e8f4;
    }
    else
    {
        *(unsigned long long *)(idx + 8) = v4;
        if (sub_c68684(a0, a3, &v0))
        {
            *(__m128i *)a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(a3, a3));
LABEL_a6e8f4:
            v5 = sub_c68684(a0, a1, a2);
            if (!(unsigned int)v5)
                return v5;
            *(__m128i *)a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(a1, a1));
            if (*(long long *)&a0->padding_19[7] && *(long long *)*(long long *)&a0->padding_19[7] && sub_c68a50(a0))
                return 1;
        }
    }
    return 0;
}
