/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb14400..0xb144cc (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b14400_2 {
    long long field_0;
    char field_8;
    char padding_9[255];
    struct st_b14400_1 *field_108;
} st_b14400_2;

typedef struct st_b14400_1 {
    char padding_0[24];
    unsigned int field_18;
} st_b14400_1;


long long * sub_b14400(long long a0, long long a1, st_b14400_2 *a2)
{
    long long *v3;  // x19
    unsigned int v4;  // w0
    long long *v5;  // x0
    long long *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9ca7fc(0, a0, a1);
    if (v3 && sub_9ca8cc(0, 0, 0, &v0, v3) && !(v4 = sub_a99eac(*v0), sub_a99eac(*v0) != a2->field_108->field_18 && (sub_a99eac(*v0) != 408 || a2->field_108->field_18 != 1172)))
        v5 = sub_a2a704(v3, sub_9f2aec(a2->field_0), &a2->field_8);
    else
        v5 = 0;
    sub_9ca820(v3);
    return v5;
}
