/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a3e68..0x2a3fb8 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a3e68_3 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_2a3e68_3;

typedef struct st_2a3e68_0 {
    char field_0;
} st_2a3e68_0;

typedef struct st_2a3e68_1 {
    char padding_0[256];
    unsigned long long field_100;
    char padding_108[1240];
    unsigned long long field_5e0;
} st_2a3e68_1;

typedef struct st_2a3e68_2 {
    char padding_0[96];
    struct st_2a3e68_1 *field_60;
} st_2a3e68_2;

extern unsigned long long g_e7b6d0;
extern unsigned long long g_e7b758;
extern st_2a3e68_2 *g_f0d198;

unsigned long long sub_2a3e68(char idx, unsigned long a1, unsigned long a2)
{
    char v4;  // x8
    unsigned long long v5;  // x9
    st_2a3e68_3 **v6;  // x10
    unsigned long long *v7;  // x8
    unsigned long long v8;  // x9
    unsigned long iter;  // x14
    st_2a3e68_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_2a3e68_0 *v1;  // [bp-0x18]
    st_2a3e68_0 *v2;  // [bp-0x10]
    st_2a3e68_0 **v3;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a2 & 1)
    {
        if (!idx)
            return 0;
    }
    else
    {
        if (!(g_f0d198->field_60->field_100 >> 59 & 1))
        {
            return 0;
        }
        else if (!idx)
        {
            return 0;
        }
        else if (!(g_f0d198->field_60->field_100 >> 10 & 1))
        {
            return 0;
        }
    }
    v4 = *(long long *)(idx + 8);
    if (!v4)
    {
        return v4;
    }
    else if (*(char *)(idx + 2) < 0)
    {
        return 1;
    }
    else if (*(long long *)(v4 + 80) != g_f0d198->field_60->field_5e0)
    {
        v5 = 2863311531 * ((unsigned long long)(*(long long *)(idx + 64) - *(long long *)(idx + 40)) >> 4);
        if ((unsigned int)v5)
        {
            v6 = *(long long *)(idx + 40) + 8;
            v7 = &g_e7b758;
            do
            {
                v8 = v5;
                if (*v6->field_c != 8)
                    continue;
                iter = *v6->field_0;
                v2 = &v3;
                v3 = &v2;
                if (!(*(char *)(iter + 3) & 1))
                    iter = *(long long *)(iter + 24);
                if (*(char *)(iter + 2) < 0)
                {
                    v7 = &g_e7b6d0;
                    break;
                }
            } while ((v6 += 6, v5 = v8 - 1, v8 != 1));
            goto *((void *)(*v7));
        }
        else
        {
            goto *((void *)(g_e7b758));
        }
    }
    else
    {
        return 1;
    }
}
