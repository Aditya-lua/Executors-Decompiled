/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52f4..0xb53d4 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52f4_0 {
    char field_0;
} st_b52f4_0;

extern unsigned long long g_e6c5d0;
extern unsigned long long g_e6c608;

unsigned long long * sub_b52f4(unsigned long long *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long v2;  // x13
    unsigned long v3;  // x14
    void* v4;  // x12
    unsigned long long v5;  // x15
    unsigned long long v6;  // x11
    unsigned long long v7;  // x16
    unsigned long long v8;  // w15
    unsigned long v9;  // x13
    st_b52f4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_b52f4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a1)
        return a0;
    v2 = a0[1];
    v3 = a0[3];
    if (v3 <= v2)
        return a0;
    v4 = *a0 + 12 * v2;
    v5 = (int)v4[4];
    v6 = a1 - v5;
    if (a1 > v5)
    {
        *(unsigned int *)&v4[4] = 0;
        v7 = (int)v4[8];
        if (v7 > v6)
        {
            v8 = (unsigned int)(v7 - v6);
            *(unsigned int *)&v4[8] = v8;
            if (a2 > v8)
            {
                v9 = v2 + 1;
                if (v3 > v9)
                    *(unsigned int *)&v4[16] = (int)v4[16] + v8;
                a0[1] = v9;
                goto *((void *)(g_e6c5d0));
            }
            else
            {
                goto *((void *)(g_e6c5d0));
            }
        }
        else
        {
            *(unsigned int *)&v4[8] = 0;
            a0[1] = v2 + 1;
            goto *((void *)(g_e6c608));
        }
    }
    else
    {
        *(unsigned int *)&v4[4] = v5 - a1;
        goto *((void *)(g_e6c5d0));
    }
}
