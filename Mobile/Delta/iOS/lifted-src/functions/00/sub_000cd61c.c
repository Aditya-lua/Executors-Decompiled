/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd61c..0xcd8ac (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cd61c_1 {
    unsigned long long field_0;
    char field_8;
    char padding_9[63];
    char field_48;
    char padding_49[47];
    unsigned long long field_78;
    char padding_80[8];
    unsigned long long field_88;
    unsigned int field_90;
    char padding_94[28];
    unsigned long long field_b0;
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    uint128_t field_f8;
    uint128_t field_108;
    unsigned long long field_118;
    unsigned long long field_120;
    unsigned long long field_128;
    unsigned long long field_130;
    unsigned long long field_138;
} st_cd61c_1;

typedef struct st_cd61c_0 {
    char field_0;
} st_cd61c_0;

extern unsigned long long g_e6d600;

unsigned long long sub_cd61c(unsigned long long idx, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long ptr;  // x0
    st_cd61c_1 *ptr1;  // x20
    unsigned long v17;  // x9
    unsigned long long v18;  // x9
    unsigned long v19;  // x10
    unsigned long v20;  // x10
    unsigned long long v21;  // x0
    unsigned long long ptr2;  // x0
    unsigned long v10;  // x9
    unsigned long v11;  // x10
    unsigned long v12;  // x11
    unsigned long v13;  // x10
    unsigned long v14;  // x9
    uint128_t v15;  // q1
    uint128_t v16;  // q1
    st_cd61c_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_cd61c_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x54], Other Possible Types: unsigned int
    unsigned long v3;  // [bp-0x50]
    unsigned int v4;  // [bp-0x44]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (!idx)
    {
        return 0xffffff9a;
    }
    else if (a4)
    {
        return 0xffffff9a;
    }
    else if (*(long long *)(idx + 144))
    {
        if (*(long long *)(idx + 320))
            sub_ce4e8(idx);
        if (sub_ce5d0(idx, &v4, &v3, &v2))
            return 0xffffff99;
        ptr = _malloc(320);
        if (!ptr)
            return 0xffffff98;
        ptr1 = ptr;
        ptr2 = _malloc(0x4000);
        ptr1->field_0 = ptr2;
        ptr1->field_88 = v3;
        ptr1->field_90 = v2;
        *(unsigned long long *)&ptr1->padding_94[4] = 0;
        *(unsigned int *)&ptr1->field_130 = a3;
        if (!ptr2)
        {
            _free(ptr1);
            return 0xffffff98;
        }
        *(unsigned long long *)ptr1->padding_80 = 0;
        if (a1)
            *(int *)a1 = *(long long *)(idx + 200);
        if (a2)
        {
            v10 = *(long long *)(idx + 192);
            v11 = v10 & 6;
            v12 = 0x100;
            if (v11 == 6)
                v12 = 24;
            if (v11 == 4)
                v12 = 184;
            v13 = 32;
            if (v11 != 2)
                v13 = v12;
            *(unsigned int *)a2 = 6;
            v14 = 200;
            if (v10 & 6)
                v14 = v13;
            goto *((void *)(*(long long *)((char *)&g_e6d600 + v14)));
        }
        else
        {
            v15 = *(int128_t *)(idx + 48);
            *(int128_t *)((char *)&ptr1->field_d8 + 8) = *(int128_t *)(idx + 32);
            *(uint128_t *)((char *)&ptr1->field_e8 + 8) = v15;
            *(int128_t *)((char *)&ptr1->field_f8 + 8) = *(int128_t *)(idx + 64);
            v16 = *(int128_t *)(idx + 16);
            *(int128_t *)((char *)&ptr1->field_b8 + 8) = *(int128_t *)idx;
            v17 = *(long long *)(idx + 216);
            *(unsigned long long *)&ptr1->padding_94[20] = 0;
            ptr1->field_b0 = v17;
            *(unsigned long long *)&ptr1->padding_94[12] = 0;
            v18 = *(long long *)(idx + 200);
            v19 = *(long long *)(idx + 96);
            *(long long *)((char *)&ptr1->field_108 + 8) = *(long long *)(idx + 80);
            ptr1->field_118 = v19;
            *(uint128_t *)((char *)&ptr1->field_c8 + 8) = v16;
            v20 = *(long long *)(idx + 120);
            ptr1->field_120 = v18;
            ptr1->field_128 = v20;
            *(unsigned long long *)&ptr1->padding_9[39] = 0;
            if (!a3 && v18 == 12)
            {
                *(unsigned int *)&ptr1->field_130 = 1;
            }
            else if (!a3 && v18 == 8)
            {
                *(unsigned long long *)&ptr1->field_8 = 0;
                *(unsigned int *)&ptr1->padding_9[7] = 0;
                memset(&ptr1->field_48, 0, 24);
                v21 = sub_b614fc(&ptr1->field_8, 0xfffffff1, "1.3.1", 112);
                if ((unsigned int)v21)
                {
                    _free(ptr1->field_0);
                    _free(ptr1);
                    return v21;
                }
                *(unsigned long long *)ptr1->padding_80 = 8;
            }
            *(int128_t *)&(&ptr1->field_b0)[1] = *(int128_t *)(idx + 224);
            ptr1->field_78 = *(long long *)(idx + 312) + v4 + 30;
            *(unsigned int *)&ptr1->padding_9[7] = 0;
            *(st_cd61c_1 **)(idx + 320) = ptr1;
            *(unsigned int *)(idx + 328) = 0;
            return 0;
        }
    }
    else
    {
        return 0xffffff9a;
    }
}
