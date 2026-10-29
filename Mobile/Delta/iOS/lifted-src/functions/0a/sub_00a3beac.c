/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3beac..0xa3bffc (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3beac_0 {
    char padding_0[8];
    long long field_8;
} st_a3beac_0;

typedef struct st_a3beac_1 {
    struct st_a3beac_0 *field_0;
    struct st_a3beac_2 *field_8;
    char padding_10[12];
    struct st_a3beac_2 *field_1c;
    struct st_a3beac_2 *field_20;
    char padding_28[16];
    struct st_a3beac_2 *field_38;
    unsigned long long field_40;
} st_a3beac_1;

typedef struct st_a3beac_2 {
    unsigned long long field_0;
} st_a3beac_2;

extern unsigned long long g_c7c2eb;

unsigned long long sub_a3beac(unsigned long long a0, long long a1, st_a3beac_1 *a2)
{
    unsigned long long v2;  // x0
    unsigned long long *v3;  // w0
    unsigned long long *v4;  // x0
    unsigned long long *v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x20
    unsigned long long v8;  // x0
    unsigned long long *v9;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3bbe8();
    if ((int)v2 < 1)
        return v2;
    if ((unsigned int)a0 == 8)
    {
        if ((int)a2->field_8 != 1)
            goto LABEL_a3bf64;
        if (a2->field_1c)
            v5 = sub_a50a58(a2->field_1c);
        else
            v5 = &g_c7c2eb;
        a2->field_1c = v5;
        v3 = (unsigned long long *)(unsigned int)_strlen(v5);
        goto LABEL_a3bf60;
    }
    else if ((unsigned int)a0 == 1)
    {
        if ((int)a2->field_8 == 2)
        {
            if (a2->field_1c)
                v4 = sub_a50a58(a2->field_1c);
            else
                v4 = sub_a9976c(*(int *)&(a2->padding_10)[1]);
            a2->field_1c = v4;
            v3 = (unsigned long long *)(unsigned int)_strlen(v4);
            goto LABEL_a3bf60;
        }
        else if ((int)a2->field_8 == 1)
        {
            *(struct st_a3beac_2 **)&a2->padding_28[8] = a2->field_1c;
            a2->field_1c = &a2->field_38;
            v3 = (unsigned long long *)50;
LABEL_a3bf60:
            *(unsigned int *)&(a2->padding_10)[1] = (unsigned int)v3;
        }
    }
LABEL_a3bf64:
    v6 = sub_a3aef4(a0, a1, a2);
    if ((int)v6 < 1)
        return v6;
    if ((unsigned int)a0 != 7)
    {
        if ((unsigned int)a0 != 2)
        {
            return v6;
        }
        else if ((int)a2->field_8 == 1)
        {
            v7 = v6;
            v8 = sub_a58d6c(a2->field_0->field_8, a2->field_1c);
            *(unsigned long long *)*(long long *)&a2->padding_28[8] = v8;
            v9 = (unsigned long long *)1;
        }
        else
        {
            return v6;
        }
    }
    else
    {
        if ((int)a2->field_8 == 2)
        {
            v7 = v6;
            v9 = (unsigned long long *)0;
            a2->field_1c = sub_a58d6c(a2->field_0->field_8, a2->field_1c);
        }
        else
        {
            return v6;
        }
    }
    *(unsigned int *)&(a2->padding_10)[1] = (unsigned int)v9;
    return v7;
}
