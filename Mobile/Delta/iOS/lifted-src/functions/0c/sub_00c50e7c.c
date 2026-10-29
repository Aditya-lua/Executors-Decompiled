/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc50e7c..0xc51370 (1268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c50e7c_0 {
    struct st_c50e7c_1 *field_0;
    unsigned long long field_8;
} st_c50e7c_0;

typedef struct st_c50e7c_1 {
    char field_0;
} st_c50e7c_1;

typedef struct st_c50e7c_2 {
    char padding_0[10];
    unsigned short field_a;
} st_c50e7c_2;

extern char g_e07222;
extern char g_e0724e;

void* sub_c50e7c(void* a0, st_c50e7c_0 *a1, unsigned int a2, st_c50e7c_2 *a3, unsigned long a4)
{
    unsigned long long v0;  // x7
    char *v1;  // x6
    unsigned long long v2;  // x4
    st_c50e7c_2 *i;  // x3
    unsigned int v4;  // w20
    unsigned long long v5;  // x4
    char *v6;  // x19
    unsigned long v8;  // x7

    if (a4)
    {
        v0 = 0;
        v1 = a1->field_0;
        v2 = a1->field_8;
        i = a3;
        do
        {
            v4 = i->field_a;
            if (43 >= v4 - 1)
                goto *((void *)(sub_c50eec + *(&(&g_e07222)[v4] - 1) * 4));
            if (2 > v4 + 0xffffe0e0)
            {
                v0 += (char)(a2 >> 8);
            }
            else
            {
                if (v0)
                {
                    v5 = v2 - v0;
                    if (v2 < v0)
                    {
                        *(char *)a0 = 19;
                        *(char **)&a0[8] = v1;
                        return a0;
                    }
                    v6 = &v1[v0];
                    a1->field_0 = v6;
                    a1->field_8 = v5;
                    v2 = v5;
                    if (32 >= v4 - 3)
                        goto *((void *)(sub_c50f38 + *(&(&g_e0724e)[v4] - 3) * 4));
                }
                else
                {
                    v6 = v1;
                    if (v4 - 3 <= 32)
                        goto *((void *)(sub_c50f38 + *(&(&g_e0724e)[v4] - 3) * 4));
                }
                if (2 <= v4 + 0xffffe0ff)
                {
                    *(char *)a0 = 12;
                    *(unsigned short *)&a0[2] = v4;
                    return a0;
                }
                v1 = v6;
                do
                {
                    if (!v2)
                    {
                        *(unsigned short *)a0 = 19;
                        *(unsigned short *)&a0[6] = 0;
                        *(unsigned int *)&a0[2] = 0;
                        *(char **)&a0[8] = v1;
                        return a0;
                    }
                } while ((v8 = *v1, v1 += 1, v2 -= 1, a1->field_0 = v1, a1->field_8 = v2, 0));
                v0 = 0;
            }
            i = &i[1].padding_0[4];
        } while (i != (char *)a3 + 16 * a4);
        if (v0)
        {
            if (v0 > v2)
            {
                *(char *)a0 = 19;
                *(char **)&a0[8] = v1;
                return a0;
            }
            a1->field_0 = &v1[v0];
            a1->field_8 = v2 - v0;
        }
    }
    *(char *)a0 = 82;
    return a0;
}
