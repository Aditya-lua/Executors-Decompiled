/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ff308..0x9ff3d4 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ff308_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[112];
    char field_80;
    char padding_81[7];
    char field_88;
    char padding_89[47];
    struct st_9ff308_0 *field_b8;
    long long field_c0;
} st_9ff308_2;

typedef struct st_9ff308_0 {
    char padding_0[24];
    struct st_9ff308_1 *field_18;
} st_9ff308_0;

typedef struct st_9ff308_1 {
    unsigned long long field_0;
} st_9ff308_1;


char sub_9ff308(long long a0, st_9ff308_2 *a1, long long a2, unsigned long a3)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4958();
    if (!v2)
        return 0;
    v3 = v2;
    if (a1->field_80 & 1 && !sub_9e6fac(&a1->field_88, a1->field_c0, a1->field_8, a0))
    {
        sub_9e4838(v3);
        return 0;
    }
    sub_9e5cb4(v3, a2, 4);
    a1->field_b8->field_18();
}
