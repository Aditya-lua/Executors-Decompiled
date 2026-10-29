/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b8ba4..0x9b8de4 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b8ba4_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[12];
    char field_2c;
    char padding_2d[195];
    int field_f0;
} st_9b8ba4_0;

typedef struct st_9b8ba4_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9b8ba4_1;

typedef struct st_9b8ba4_2 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_9b8ba4_2;

extern st_9b8ba4_2 g_d29740;
extern st_9b8ba4_1 g_d29b68;
extern st_9b8ba4_1 g_d29f68;
extern st_9b8ba4_1 g_d2a368;
extern st_9b8ba4_1 g_d2a768;

int sub_9b8ba4(unsigned long a0, unsigned long a1, st_9b8ba4_0 *a2)
{
    unsigned long long v2;  // x0
    unsigned long long i;  // x8
    unsigned int v12;  // w12
    unsigned int *node;  // x8
    int j;  // w9
    unsigned long v16;  // x15
    unsigned long v17;  // x16
    unsigned long idx;  // x0
    unsigned long index;  // x1
    unsigned long idx1;  // x17
    unsigned long idx2;  // x0
    unsigned int v4;  // w10
    unsigned long v22;  // x15
    unsigned long v23;  // x17
    unsigned long v24;  // x17
    unsigned long v25;  // x15
    unsigned long v26;  // x17
    unsigned long v27;  // x17
    unsigned long long v5;  // x11
    unsigned int *iter;  // x9
    unsigned int *iter1;  // x10
    unsigned long long v8;  // x11
    unsigned int v9;  // w12
    unsigned int v10;  // w12
    unsigned int v11;  // w12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9b8880();
    if (!(v2 >> 31 & 1))
    {
        if (a2->field_f0 >= 1)
        {
            i = 0;
            v4 = a2->field_f0 * 4;
            v5 = v4 - 4;
            iter = &a2->field_8;
            iter1 = &iter[v4];
            do
            {
                v8 = v5;
                v9 = *(int *)((char *)iter - 8);
                *(int *)((char *)iter - 8) = *(int *)((char *)iter1 - 8);
                *(unsigned int *)((char *)iter1 - 8) = v9;
                v10 = *(int *)((char *)iter - 4);
                *(int *)((char *)iter - 4) = *(int *)((char *)iter1 - 4);
                *(unsigned int *)((char *)iter1 - 4) = v10;
                v11 = *iter;
                *iter = *iter1;
                *iter1 = v11;
                v12 = iter[1];
                iter[1] = iter1[1];
                iter1[1] = v12;
                i += 4;
                iter1 = (char *)iter1 - 16;
                iter += 4;
                v5 = v8 - 4;
            } while ((long long)i < (long long)v8);
            if (a2->field_f0 >= 2)
            {
                node = &a2->field_1c;
                j = 1;
                do
                {
                    v16 = *(int *)((char *)node - 12);
                    v17 = *(int *)((char *)node - 8);
                    idx = (&g_d29740.field_0)[4 * ((v16 * 0x1000000000000 | v16 >> 16) & 0xffff0000000000ff & 0xff)];
                    index = (&g_d29740.field_0)[4 * ((v16 * 0x100000000000000 | v16 >> 8) & 0xff000000000000ff & 0xff)];
                    *(unsigned int *)((char *)node - 12) = (&g_d29f68.field_0)[idx] ^ (&g_d29b68.field_0)[(&g_d29740.field_0)[v16 >> 22 & 0x3fc]] ^ (&g_d2a368.field_0)[index] ^ (&g_d2a768.field_0)[(&g_d29740.field_0)[4 * (v16 & 0xff)]];
                    idx1 = (&g_d29740.field_0)[4 * ((v17 * 0x1000000000000 | v17 >> 16) & 0xffff0000000000ff & 0xff)];
                    idx2 = (&g_d29740.field_0)[4 * ((v17 * 0x100000000000000 | v17 >> 8) & 0xff000000000000ff & 0xff)];
                    *(unsigned int *)((char *)node - 8) = (&g_d29f68.field_0)[idx1] ^ (&g_d29b68.field_0)[(&g_d29740.field_0)[v17 >> 22 & 0x3fc]] ^ (&g_d2a368.field_0)[idx2] ^ (&g_d2a768.field_0)[(&g_d29740.field_0)[4 * (v17 & 0xff)]];
                    v22 = *(int *)((char *)node - 4);
                    v23 = (&g_d29740.field_0)[4 * ((v22 * 0x1000000000000 | v22 >> 16) & 0xffff0000000000ff & 0xff)];
                    v24 = (&g_d29740.field_0)[4 * ((v22 * 0x100000000000000 | v22 >> 8) & 0xff000000000000ff & 0xff)];
                    *(unsigned int *)((char *)node - 4) = (&g_d29f68.field_0)[v23] ^ (&g_d29b68.field_0)[(&g_d29740.field_0)[v22 >> 22 & 0x3fc]] ^ (&g_d2a368.field_0)[v24] ^ (&g_d2a768.field_0)[(&g_d29740.field_0)[4 * (v22 & 0xff)]];
                    v25 = *node;
                    v26 = (&g_d29740.field_0)[4 * ((v25 * 0x1000000000000 | v25 >> 16) & 0xffff0000000000ff & 0xff)];
                    v27 = (&g_d29740.field_0)[4 * ((v25 * 0x100000000000000 | v25 >> 8) & 0xff000000000000ff & 0xff)];
                    *node = (&g_d29f68.field_0)[v26] ^ (&g_d29b68.field_0)[(&g_d29740.field_0)[v25 >> 22 & 0x3fc]] ^ (&g_d2a368.field_0)[v27] ^ (&g_d2a768.field_0)[(&g_d29740.field_0)[4 * (v25 & 0xff)]];
                    node += 4;
                    j += 1;
                } while (j < a2->field_f0);
            }
        }
        v2 = 0;
    }
    return v2;
}
