/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b0e34..0x9b109c (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b0e34_1 {
    unsigned int field_0;
    char padding_4[212];
    struct st_9b0e34_0 *field_d8;
} st_9b0e34_1;

typedef struct st_9b0e34_2 {
    char padding_0[24];
    struct st_9b0e34_1 *field_18;
} st_9b0e34_2;

typedef struct st_9b0e34_0 {
    char padding_0[80];
    char field_50;
} st_9b0e34_0;

typedef struct st_9b0e34_3 {
    unsigned long long field_0;
} st_9b0e34_3;

extern st_9b0e34_3 *g_e89520;
extern st_9b0e34_3 *g_e895b0;

char sub_9b0e34(st_9b0e34_2 *a0, int a1, unsigned long long a2)
{
    int v3;  // w20
    st_9b0e34_3 **v4;  // x22
    char v5;  // w8
    char v6;  // w24
    st_9b0e34_3 **v7;  // x22
    unsigned long long v8;  // x8
    unsigned long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    if (a0->field_18->field_0 != 0x10000)
    {
        if (a0->field_18->field_0 != 0x1ffff)
            return *(int *)&a0[2].padding_0[8] == v3;
        v4 = &g_e895b0;
        v5 = (int)g_e895b0;
        if ((int)g_e895b0)
            goto LABEL_9b0e9c;
    }
    else
    {
        v4 = &g_e89520;
        v5 = (int)g_e89520;
        if ((int)g_e89520)
        {
LABEL_9b0e9c:
            v0 = a2;
            if (v3 == 0x100)
                v6 = 0xff00;
            else
                v6 = v3;
            do
            {
                v7 = v4;
                if (v5 == v3)
                {
                    v8 = 16;
                    if (!(int)a0[3].field_18)
                        v8 = 8;
                    if (*(long long *)((char *)v7 + v8))
                        (*(long long *)((char *)v7 + v8))();
                }
                else if (a0->field_18->field_d8->field_50 >> 3 & 1)
                {
                    if (v5 == 0x100)
                        v5 = 0xff00;
                    if (v6 <= v5)
                        break;
                }
                else if (v3 >= v5)
                {
                    break;
                }
            } while ((v5 = (int)v7[3], v4 = v7 + 3, (int)v7[3]));
        }
    }
    return 0;
}
