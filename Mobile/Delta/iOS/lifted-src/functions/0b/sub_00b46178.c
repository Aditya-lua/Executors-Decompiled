/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb46178..0xb462ac (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b46178_1 {
    long long field_0;
} st_b46178_1;

typedef struct st_b46178_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[32];
    struct st_b46178_1 *field_30;
    char padding_38[32];
    struct st_b46178_1 *field_58;
} st_b46178_0;


unsigned long long * sub_b46178(st_b46178_0 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long *v4;  // x0
    st_b46178_0 *v0;  // [bp-0x60]
    unsigned long long *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a6820c(sub_9f2aec(a0->field_8), 6);
    if (!v4)
        return v4;
    if (a0->field_30 && a0->field_58)
        a0->field_58();
    v0 = a0;
    v1 = 0;
    if (!sub_a7c268(v4 + 1, 1, &v1, *v4))
        return 0;
    return sub_afdd08(a0->field_8, a1, a2, a3, &v0, 16);
}
