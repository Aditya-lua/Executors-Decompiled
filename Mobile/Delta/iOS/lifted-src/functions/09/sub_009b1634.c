/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b1634..0x9b1770 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b1634_0 {
    unsigned int field_0;
    char padding_4[212];
    void* field_d8;
} st_9b1634_0;

typedef struct st_9b1634_2 {
    unsigned long long field_0;
} st_9b1634_2;

typedef struct st_9b1634_1 {
    char padding_0[24];
    struct st_9b1634_0 *field_18;
    char padding_20[88];
    unsigned int field_78;
} st_9b1634_1;

extern st_9b1634_2 *g_e89520;
extern st_9b1634_2 *g_e895b0;

st_9b1634_1 * sub_9b1634(st_9b1634_1 *a0, unsigned int a1, unsigned int *a2)
{
    st_9b1634_1 *v2;  // x0
    st_9b1634_2 **v4;  // x21
    unsigned int v5;  // w8
    st_9b1634_2 **v6;  // x21
    unsigned long long v7;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1 == 0x303)
    {
        v2 = sub_9b0e34(a0, 772, 0);
        if ((unsigned int)v2)
        {
            *a2 = 1;
            return v2;
        }
    }
    if (770 >= (int)a1 && !((unsigned int)((int)a0->field_18->field_d8[80]) >> 3 & 1))
    {
        if (a0->field_18->field_0 == 0x10000)
        {
            v4 = &g_e89520;
            v5 = (int)g_e89520;
            if ((int)g_e89520)
            {
LABEL_9b16cc:
                do
                {
                    v6 = v4;
                    if (v5 == 0x303)
                    {
                        if (!a0->field_78)
                            v7 = 8;
                        else
                            v7 = 16;
                        if (*(long long *)((char *)v6 + v7))
                            (*(long long *)((char *)v6 + v7))();
                    }
                    else
                    {
                        if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1))
                        {
                            if ((int)v5 <= 0x303)
                                break;
                        }
                        else
                        {
                            if (v5 == 0x100 || (int)v5 >= 0x303)
                                break;
                        }
                    }
                } while ((v5 = (int)v6[3], v4 = v6 + 3, (int)v6[3]));
            }
        }
        else if (a0->field_18->field_0 == 0x1ffff)
        {
            v4 = &g_e895b0;
            v5 = (int)g_e895b0;
            if ((int)g_e895b0)
                goto LABEL_9b16cc;
        }
        else if (*(int *)&a0->padding_20[40] == 0x303)
        {
            *a2 = 2;
            return v2;
        }
    }
    *a2 = 0;
    return v2;
}
