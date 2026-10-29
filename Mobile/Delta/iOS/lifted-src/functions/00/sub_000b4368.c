/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4368..0xb440c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4368_0 {
    char field_0;
} st_b4368_0;

extern unsigned long long g_e6c640;
extern unsigned long long g_e6c668;

void* sub_b4368(void* a0, unsigned int a1)
{
    unsigned int v2;  // w13
    unsigned long v3;  // x10
    unsigned int *v4;  // x14
    st_b4368_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_b4368_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (int)a0[16] + a1;
    if (v2)
    {
        v3 = (long long)a0[8];
        if ((unsigned long long)(long long)a0[24] > v3)
        {
            v4 = *(long long *)a0 + 12 * v3;
            if (v4[2] + v4[1] > v2)
            {
                *(unsigned long long *)&a0[16] = v2;
                goto *((void *)(g_e6c640));
            }
            else
            {
                *(unsigned long *)&a0[8] = v3 + 1;
                goto *((void *)(g_e6c668));
            }
        }
        else if (v3 != (long long)a0[24])
        {
            return a0;
        }
    }
    *(unsigned long long *)&a0[16] = 0;
    return a0;
}
