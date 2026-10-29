/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5cd20..0xc5cef4 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5cd20_1 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_c5cd20_2 *field_8;
} st_c5cd20_1;

typedef struct st_c5cd20_2 {
    unsigned int field_0;
} st_c5cd20_2;

typedef struct st_c5cd20_0 {
    unsigned int field_0;
    unsigned short field_4;
    char field_6;
    char field_7;
    char field_8;
    char field_9;
    char field_a;
    char field_b;
} st_c5cd20_0;

extern long long g_e0d665;
extern char g_1000000;

unsigned int * sub_c5cd20(st_c5cd20_1 *a0, long long a1, st_c5cd20_0 *a2)
{
    unsigned long v5;  // x9
    unsigned long v6;  // x8
    unsigned long long v15;  // 4112
    unsigned int v7;  // w8
    unsigned int v8;  // w10
    unsigned long v9;  // x9
    unsigned int v10;  // w10
    unsigned int v11;  // w21
    unsigned int *v12;  // x0
    unsigned long long v13;  // 4112
    unsigned long v14;  // x9
    unsigned long v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x60]
    unsigned int *v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2->field_7;
    v6 = a2->field_8;
    if (a2->field_6 & 1)
    {
        if (v5 & 1)
        {
            if (v6 & 1)
                goto LABEL_c5cd80;
            v7 = 2;
            goto LABEL_c5cd70;
        }
        else
        {
            if (!(v6 & 1))
            {
                if (a2->field_9 & 1 || a2->field_a & 1 || a2->field_b & 1)
                    goto LABEL_c5cdb4;
                v7 = 0;
                v10 = 0;
LABEL_c5ce00:
                v11 = v7 | v10 | a2->field_0 & 0xfffffffc;
                v0 = a2->field_4;
                v12 = _open(a1, v11 | &g_1000000);
                v13 = arm64g_calculate_condition(0x11, v12 & 0xffffffff, 1, 0);
                if (!(v13 & 1))
                {
                    do
                    {
                        v12 = ___error();
                        v14 = *v12;
                        v2 = 2 | v14 * 0x100000000;
                        v1 = 1;
                        if ((unsigned int)v14 != 4)
                        {
                            a0->field_8 = v2;
                            a0->field_0 = 1;
                            return v12;
                        }
                        sub_c40ff0(&v2);
                        v12 = _open(a1, v11 | &g_1000000);
                        v15 = arm64g_calculate_condition(1, v12 & 0xffffffff, 1, 0);
                    } while (v15 & 1);
                }
                a0->field_4 = (unsigned int)v12;
                a0->field_0 = 0;
                return v12;
            }
LABEL_c5cd80:
            v7 = 10;
            v8 = a2->field_9;
            v9 = a2->field_b;
            if (v8 == 1)
                goto LABEL_c5cdb0;
        }
    }
    else
    {
        if (v5 & 1)
        {
            if (v6 & 1)
                goto LABEL_c5cd9c;
            v7 = 1;
LABEL_c5cd70:
            v9 = a2->field_b;
            v8 = a2->field_9;
        }
        else
        {
            if (!(v6 & 1))
            {
                if (!(a2->field_a & 1) && !(a2->field_b & 1) && !(a2->field_9 & 1))
                {
                    v12 = sub_c5cef4("must specify at least one of read, write, or append access", 58);
                    a0->field_8 = v12;
                    a0->field_0 = 1;
                    return v12;
                }
LABEL_c5cdb4:
                v12 = sub_c5cef4(&g_e0d665, 61);
                a0->field_8 = v12;
                a0->field_0 = 1;
                return v12;
            }
LABEL_c5cd9c:
            v7 = 9;
            v8 = a2->field_9;
            v9 = a2->field_b;
            if (v8 == 1)
            {
LABEL_c5cdb0:
                if (!(v9 & 1))
                {
                    v12 = sub_c5cef4(&g_e0d665, 61);
                    a0->field_8 = v12;
                    a0->field_0 = 1;
                    return v12;
                }
            }
        }
    }
    if (a2->field_a & 1)
    {
        if (v8 & 1)
            v10 = 0x600;
        else
            v10 = 0x200;
        if (v9 & 1)
            goto LABEL_c5cdfc;
        goto LABEL_c5ce00;
    }
    else
    {
        if (v8 & 1)
            v10 = 0x400;
        else
            v10 = 0;
        if (v9 & 1)
        {
LABEL_c5cdfc:
            v10 = 0xa00;
            goto LABEL_c5ce00;
        }
    }
}
