/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98458c..0x9845f4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98458c_2 {
    unsigned long long field_0;
} st_98458c_2;

typedef struct st_98458c_1 {
    char padding_0[1024];
    struct st_98458c_2 *field_400;
} st_98458c_1;

typedef struct st_98458c_0 {
    char padding_0[112];
    char field_70;
} st_98458c_0;


int sub_98458c(st_98458c_1 *a0, st_98458c_0 *a1)
{
    unsigned long long *v3;  // x10
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (3 >= a1->field_70 - 2)
    {
        v3 = a0->field_400;
        if (!a0->field_400)
            return 1;
    }
    else
    {
        v3 = a0->field_400;
        if (!a0->field_400)
            return 1;
    }
    v0 = &v2;
    v1 = v4;
    v3();
}
