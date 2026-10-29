/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb28920..0xb28980 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b28920_0 {
    unsigned long long field_0;
    char padding_8[20];
    struct st_b28920_0 *field_1c;
} st_b28920_0;


st_b28920_0 * sub_b28920(long long a0)
{
    st_b28920_0 *v2;  // x0
    st_b28920_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(72, "providers/implementations/exchange/dh_exch.c", 89);
    if (!v2)
        return v2;
    v3 = v2;
    v3->field_0 = sub_9f2aec(a0);
    *(unsigned int *)&(v3->padding_8)[1] = 0;
    return v3;
}
