/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991f74..0x99206c (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991f74_2 {
    char padding_0[3184];
    struct st_991f74_0 *field_c70;
    char padding_c78[152];
    unsigned long long field_d10;
} st_991f74_2;

typedef struct st_991f74_0 {
    char padding_0[72];
    struct st_991f74_1 *field_48;
} st_991f74_0;

typedef struct st_991f74_1 {
    unsigned long long field_0;
} st_991f74_1;


int sub_991f74(st_991f74_2 *a0, unsigned long long *a1, unsigned long a2)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a1)
        a0->field_c70->field_48();
    if (!a2 || (v2 = a1[4], v2 == a2))
    {
        sub_a6c2e4(a1[3], "ssl/record/rec_layer_s3.c", 579);
        a1[3] = 0;
        a0->field_d10 = a0->field_d10 + 1;
        v2 = a1[4];
    }
    a1[4] = v2 - a2;
    if (v2 != a2)
    {
        a1[5] = a1[5] + a2;
        return 1;
    }
    a1[5] = 0;
    return 1;
}
