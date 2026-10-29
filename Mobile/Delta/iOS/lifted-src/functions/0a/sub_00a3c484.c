/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3c484..0xa3c554 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3c484_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[16];
    struct st_a3c484_1 *field_1c;
    struct st_a3c484_1 *field_20;
    unsigned long long field_28;
    char padding_30[16];
    char field_40;
} st_a3c484_0;

typedef struct st_a3c484_1 {
    char field_0;
} st_a3c484_1;


char * sub_a3c484(unsigned long long a0, long long a1, st_a3c484_0 *a2)
{
    char *v3;  // x0
    char *v4;  // x0
    char *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_a3bbe8();
    if ((int)(unsigned int)v3 < 1)
    {
        return v3;
    }
    else if (a2->field_8 == 2)
    {
        if ((unsigned int)a0 == 7)
        {
            v0 = &a2->padding_30[8];
            a2->field_1c = &v0;
            a2->field_20 = 50;
        }
        else if ((unsigned int)a0 == 1)
        {
            a2->field_1c = sub_a9976c(*(int *)&(a2->padding_c)[1]);
            *(unsigned int *)&(a2->padding_c)[1] = 0;
        }
        v4 = sub_a3aef4(a0, a1, a2);
        if ((unsigned int)a0 != 7)
        {
            return v4;
        }
        else if ((int)(unsigned int)v4 >= 1)
        {
            *(unsigned int *)&(a2->padding_c)[1] = sub_a998f4(v0);
            a2->field_1c = 0;
            return v4;
        }
        else
        {
            return v4;
        }
    }
    else
    {
        return 0;
    }
}
