/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f10ac..0x1f1298 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f10ac_0 {
    char padding_0[8];
    long long field_8;
} st_1f10ac_0;

typedef struct st_1f10ac_2 {
    struct st_1f10ac_1 *field_0;
    long long field_8;
} st_1f10ac_2;

typedef struct st_1f10ac_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned long long field_8;
} st_1f10ac_1;

typedef struct st_1f10ac_5 {
    char padding_0[4];
    unsigned int field_4;
} st_1f10ac_5;

typedef struct st_1f10ac_6 {
    char field_0;
} st_1f10ac_6;

extern unsigned long long g_e788f0;
extern unsigned long long g_e78968;

void sub_1f10ac(st_1f10ac_2 *a0, st_1f10ac_0 *a1, st_1f10ac_2 *a2)
{
    long long i;  // x24
    st_1f10ac_1 *v7;  // x27
    unsigned long v16;  // x26
    long long v8;  // x28
    unsigned int *v9;  // x26
    unsigned int v10;  // w8
    unsigned int v11;  // w10
    unsigned int v12;  // w11
    st_1f10ac_5 *v13;  // x25
    unsigned int v14;  // w9
    unsigned long v15;  // x25
    st_1f10ac_6 **v0;  // [bp-0x78], Other Possible Types: char
    st_1f10ac_6 *v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x68]
    unsigned int v3;  // [bp-0x64]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    i = 0;
    v1 = &v0;
    v0 = &v1;
    a1->field_8 = 0;
    if (0 >= (unsigned long long)a0->field_8)
        return;
    if ((unsigned long long)a2->field_8 > 0)
    {
        v7 = a0->field_0;
        v8 = 0;
        do
        {
            v9 = &a2->field_0->field_0;
            v10 = v7->field_4;
            v11 = *(int *)((char *)v9 + v8);
            if (v10 < v11)
                break;
            v12 = v7->field_0;
            v13 = (char *)v9 + v8;
            v14 = v13->field_4;
            if (v14 >= v12)
            {
                if (v11 > v12)
                {
                    if (v10 <= v14)
                    {
                        v2 = v11;
                        v3 = v10;
                        sub_1fa300(a1, &v2);
                        v7->field_4 = *(int *)((char *)v9 + v8) - 1;
                    }
                    else
                    {
                        v2 = v11;
                        v3 = v14;
                        sub_1fa300(a1, &v2);
                        v15 = v13->field_4 + 1;
                        v16 = v7->field_4;
                        v7->field_4 = *(int *)((char *)v9 + v8) - 1;
                        sub_1ef50c(a0, 1, 1);
                        a0->field_0->field_8 = v15 | v16 * 0x100000000;
                    }
                }
                else
                {
                    if (v10 > v14)
                    {
                        v2 = v12;
                        v3 = v14;
                        sub_1fa300(a1, &v2);
                        v7->field_0 = v13->field_4 + 1;
                    }
                    else
                    {
                        v2 = v12;
                        v3 = v10;
                        sub_1fa300(a1, &v2);
                        sub_1ebe5c(a0, 0);
                        goto *((void *)(g_e78968));
                    }
                }
            }
            i += 1;
            v8 += 8;
        } while ((unsigned long long)a2->field_8 > (unsigned long long)i);
        goto *((void *)(g_e788f0));
    }
    else
    {
        goto *((void *)(g_e788f0));
    }
}
