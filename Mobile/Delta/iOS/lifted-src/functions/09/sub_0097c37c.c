/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c37c..0x97c3c4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c37c_0 {
    char padding_0[8];
    struct st_97c37c_0 *field_8;
} st_97c37c_0;

typedef struct st_97c37c_2 {
    long long field_0;
} st_97c37c_2;

typedef struct st_97c37c_1 {
    char padding_0[104];
    struct st_97c37c_0 *field_68;
    struct st_97c37c_2 *field_70;
} st_97c37c_1;


void sub_97c37c(st_97c37c_1 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_97c37c_0 *v12;  // x1
    st_97c37c_0 *v13;  // x1
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_68;
    if (a0->field_68)
    {
        do
        {
            v13 = v12;
            sub_9765e4(*(long long *)a0->field_70);
            v12 = v13->field_8;
        } while (v13->field_8);
    }
}
