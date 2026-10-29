/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9565b8..0x956690 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9565b8_0 {
    char padding_0[136];
    unsigned long long field_88;
} st_9565b8_0;

typedef struct st_9565b8_1 {
    struct st_9565b8_1 *field_0;
    char padding_8[16];
    struct st_9565b8_0 *field_18;
    char padding_20[428];
    struct st_9565b8_1 *field_1cc;
    unsigned long long field_1d0;
} st_9565b8_1;


st_9565b8_1 * sub_9565b8(st_9565b8_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_9565b8_1 *v12;  // x0
    unsigned long v13;  // d0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return 0;
    if ((int)a0->field_0)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0;
    *(unsigned int *)___error() = 0;
    if (*(int *)&(a0->padding_20)[1] && !(int)v12->field_0)
    {
        v12 = a0;
        if (!sub_9929fc(&a0[6].padding_20[248]))
        {
            v12 = a0;
            if (!sub_992a48(&a0[6].padding_20[248]))
            {
                v12 = a0;
                if (!sub_9a5694(a0))
                {
                    sub_9a57c8(a0);
                    v12 = a0;
                    *(unsigned int *)&(a0->padding_20)[1] = 0;
                    v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(*(unsigned long long *)&*(double *)&a0->field_1cc, _mm_set_epi32(0, 0, 1, 1)));
                    a0->field_1cc = v13;
                }
            }
        }
    }
    goto *((void *)(v12->field_18->field_88));
}
