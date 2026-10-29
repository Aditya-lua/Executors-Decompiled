/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d1d64..0x3d1eb8 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d1d64_1 {
    struct st_3d1d64_2 *field_0;
    char padding_8[16];
    void* field_18;
} st_3d1d64_1;

typedef struct st_3d1d64_2 {
    unsigned int field_0;
    unsigned int field_4;
} st_3d1d64_2;

typedef struct st_3d1d64_0 {
    char field_0;
} st_3d1d64_0;


st_3d1d64_1 * sub_3d1d64(st_3d1d64_1 *a0, void* a1, unsigned int a2)
{
    unsigned long v2;  // x8
    void* node;  // x9
    unsigned long long v12;  // w8
    unsigned long long v13;  // w8
    unsigned long long v14;  // x10
    void* iter;  // x9
    unsigned long v16;  // x8
    unsigned long long v4;  // x10
    unsigned long long v5;  // x10
    unsigned short v6;  // 4117
    unsigned short *iter1;  // x9
    unsigned long long i;  // x12
    unsigned long long v9;  // x12
    uint128_t v10;  // q1
    st_3d1d64_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3d1d64_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0->field_0 * a0->field_0->field_4;
    node = a0->field_18;
    if (a2 == 2)
    {
        if ((unsigned int)v2)
        {
            if ((unsigned int)v2 < 9 || a1 + 2 > node && node + ((unsigned int)v2 - 1) * 4 + 4 > a1)
            {
                v5 = 0;
            }
            else
            {
                v4 = v2 & 7;
                if (!(v2 & 7))
                    v4 = 8;
                v5 = v2 - v4;
                v6 = *(short *)a1;
                iter1 = node + 18;
                i = v5;
                do
                {
                    v9 = i;
                    v10 = ~_mm_cmpeq_epi16(CatEvenLanesV(*(int128_t *)((char *)iter1 - 2), *(int128_t *)((char *)iter1 - 18)), CONCAT(v6 | v6 * 0x10000 | (v6 | v6 * 0x10000) * 0x100000000, v6 | v6 * 0x10000 | (v6 | v6 * 0x10000) * 0x100000000));
                    *(unsigned short *)((char *)iter1 - 16) = *(unsigned short *)&v10;
                    *(unsigned short *)((char *)iter1 - 12) = *(unsigned short *)((void*)&v10 + 2);
                    *(unsigned short *)((char *)iter1 - 8) = *(unsigned short *)((void*)&v10 + 4);
                    *(unsigned short *)((char *)iter1 - 4) = *(unsigned short *)((void*)&v10 + 6);
                    *iter1 = *(unsigned short *)((void*)&v10 + 8);
                    iter1[2] = *(unsigned short *)((void*)&v10 + 10);
                    iter1[4] = *(unsigned short *)((void*)&v10 + 12);
                    iter1[6] = *(unsigned short *)((void*)&v10 + 14);
                    iter1 += 16;
                    i = v9 - 8;
                } while (i);
                node += v5 * 4;
            }
            v12 = (unsigned int)(v2 - v5);
            do
            {
                v13 = v12;
                if (*(short *)node == *(short *)a1)
                    v14 = 0;
                else
                    v14 = 0xffff;
            } while ((*(unsigned short *)&node[2] = v14, node += 4, v12 = v13 - 1, v13 != 1));
            return a0;
        }
        else
        {
            return a0;
        }
    }
    else
    {
        if ((unsigned int)v2)
        {
            iter = node + 4;
            do
            {
                v16 = v2;
                if (*(short *)((char *)iter - 4) == *(short *)a1 && *(short *)((char *)iter - 2) == (short)a1[2] && *(short *)iter == (short)a1[4])
                    *(unsigned short *)&iter[2] = 0;
            } while ((iter += 8, v2 = (unsigned int)v16 - 1, (unsigned int)v16 != 1));
            return a0;
        }
        else
        {
            return a0;
        }
    }
}
