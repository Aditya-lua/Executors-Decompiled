/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9696b0..0x969758 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9696b0_2 {
    char padding_0[1624];
    unsigned long long field_658;
    char padding_660[8];
    unsigned long long field_668;
} st_9696b0_2;

typedef struct st_9696b0_1 {
    char padding_0[8];
    struct st_9696b0_2 *field_8;
    char padding_10[104];
    unsigned int field_78;
    char padding_7c[2052];
    struct st_9696b0_0 *field_880;
} st_9696b0_1;

typedef struct st_9696b0_0 {
    char padding_0[30];
    unsigned short field_1e;
    char padding_20[32];
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
} st_9696b0_0;

extern char g_d282a4;
extern char g_d282a6;

int sub_9696b0(st_9696b0_1 *a0, unsigned int a1, void* a2)
{
    st_9696b0_0 *v0;  // x8
    int v1;  // w9
    unsigned long v2;  // x8

    v0 = a0->field_880;
    v1 = v0->field_1e & 3;
    if (1 >= v1)
    {
        if (!v1)
        {
            if (a0->field_78 == a1 && v0->field_50)
            {
                *(unsigned long long *)a2 = v0->field_50;
                return a0->field_880->field_58;
            }
            if (!v0->field_40)
            {
                *(unsigned long long *)a2 = a0->field_8->field_668;
                return a0->field_8->field_658;
            }
            *(unsigned long long *)a2 = v0->field_40;
            return a0->field_880->field_48;
        }
        v2 = &g_d282a4;
    }
    else if (v1 == 2)
    {
        v2 = &g_d282a6;
    }
    else
    {
        *(char **)a2 = &g_d282a4;
        return 2;
    }
    *(unsigned long *)a2 = v2;
    return 1;
}
