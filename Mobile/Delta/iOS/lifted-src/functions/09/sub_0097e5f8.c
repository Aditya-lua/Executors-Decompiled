/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e5f8..0x97e728 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97e5f8_1 {
    char padding_0[160];
    long long field_a0;
} st_97e5f8_1;

typedef struct st_97e5f8_0 {
    char padding_0[120];
    struct st_97e5f8_1 *field_78;
    struct st_97e5f8_2 *field_80;
    char padding_88[48];
    unsigned int field_b8;
} st_97e5f8_0;

typedef struct st_97e5f8_4 {
    struct st_97e5f8_3 *field_0;
    char padding_8[16];
    unsigned long long field_18;
    struct st_97e5f8_0 *field_20;
    unsigned int field_28;
} st_97e5f8_4;

typedef struct st_97e5f8_3 {
    char padding_0[112];
    char field_70;
} st_97e5f8_3;

typedef struct st_97e5f8_2 {
    char padding_0[112];
    long long field_70;
} st_97e5f8_2;


unsigned long long sub_97e5f8(st_97e5f8_4 *a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long a4)
{
    st_97e5f8_0 *v2;  // x21
    st_97e5f8_3 *v3;  // x8
    st_97e5f8_3 *v4;  // x8
    unsigned long long v5;  // w24
    long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_20;
    if (sub_97fe5c(v2))
    {
        v3 = a0->field_0;
        do
        {
            v4 = v3;
            v5 = __ROL__(v4->field_70, 27) & 4160749571 & 3;
        } while (!v5 && (v3 = *(long long *)&v4->padding_0[64], *(long long *)&v4->padding_0[64]));
        if (*(long long *)a4)
        {
            v6 = sub_97724c(v2->field_78->field_a0);
            sub_98959c(v6, v2->field_80);
        }
        if (a3 & 1 && *(long long *)a4 == a2)
            sub_988eb8(v2->field_80->field_70);
        if (v5 != 2)
            sub_982d48(sub_977244(v2->field_78->field_a0), 0);
        if (*(long long *)a4)
        {
            return 1;
        }
        else if (*(int *)&a0[1].padding_8[0])
        {
            if (a0->field_28)
            {
                if (a0->field_20)
                {
                    a0->field_20->field_b8 = 3;
                    return 0;
                }
            }
            else
            {
                if (a0->field_18)
                {
                    *(unsigned int *)(a0->field_18 + 376) = 3;
                    return 0;
                }
            }
        }
    }
    else
    {
        *(unsigned long long *)a4 = 0;
        sub_97c738(a0);
    }
    return 0;
}
