/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95672c..0x956868 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95672c_0 {
    char padding_0[128];
    struct st_95672c_1 *field_80;
} st_95672c_0;

typedef struct st_95672c_2 {
    struct st_95672c_2 *field_0;
    char padding_8[16];
    struct st_95672c_0 *field_18;
    char padding_20[428];
    struct st_95672c_2 *field_1cc;
    double field_1d0;
} st_95672c_2;

typedef struct st_95672c_1 {
    unsigned long long field_0;
} st_95672c_1;


int sub_95672c(st_95672c_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long v2;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if ((int)a0->field_0)
        {
            a0 = 0;
        }
        else
        {
            *(unsigned int *)___error() = 0;
            if (*(int *)&(a0->padding_20)[1] && !(int)a0->field_0 && !sub_9929fc(&a0[6].padding_20[248]) && !sub_992a48(&a0[6].padding_20[248]) && !sub_9a5694(a0))
            {
                sub_9a57c8(a0);
                *(unsigned int *)&(a0->padding_20)[1] = 0;
                v2 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(*(unsigned long long *)&*(double *)&a0->field_1cc, _mm_set_epi32(0, 0, 1, 1)));
                a0->field_1cc = v2;
            }
            *(unsigned int *)&a0->field_1d0 = 1;
            a0->field_18->field_80();
        }
    }
    return (unsigned int)a0;
}
