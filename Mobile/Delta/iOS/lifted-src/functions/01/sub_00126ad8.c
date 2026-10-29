/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x126ad8..0x12711c (1604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_126ad8_1 {
    struct st_126ad8_0 *field_0;
    unsigned int field_8;
    char field_c;
    char field_d;
    char field_e;
} st_126ad8_1;

typedef struct st_126ad8_0 {
    char padding_0[3];
    char field_3;
    char field_4;
    char field_5;
    char padding_6[10];
    void* field_10;
    char padding_18[48];
    void* field_48;
    char padding_50[80];
    unsigned int field_a0;
} st_126ad8_0;

typedef struct st_126ad8_2 {
    char field_0;
} st_126ad8_2;

extern long long g_c7c2eb;
extern char g_10002b0;

st_126ad8_1 * sub_126ad8(st_126ad8_1 *a0, st_126ad8_0 *a1)
{
    void* v10;  // x8
    void* v11;  // x8
    void* v20;  // x12
    void* v21;  // x8
    void* v12;  // x21
    unsigned int v13;  // w9
    void* *v14;  // x21
    unsigned long v15;  // x11
    void* v16;  // x8
    unsigned long long *v17;  // x10
    long long v18;  // x0
    long long n;  // x22
    st_126ad8_2 **v0;  // [bp-0x1a0], Other Possible Types: char
    char *v1;  // [bp-0x198]
    uint128_t v2;  // [bp-0x190], Other Possible Types: void*, uint128_t
    uint2048_t v3;  // [bp-0x180]
    char v4[256];  // [bp-0x180], Other Possible Types: uint2048_t
    void* v5;  // [bp-0x80], Other Possible Types: uint128_t, uint128_t
    uint128_t v6;  // [bp-0x70]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init((char *)&a0[1].field_0 + 1, &g_c7c2eb, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init((char *)&a0[2].field_8 + 2, &g_c7c2eb, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init((char *)&a0[4].field_0 + 4, &g_c7c2eb, 0);
    a0->field_0 = a1;
    a0->field_8 = a1->field_a0;
    a0->field_c = a1->field_3;
    a0->field_d = a1->field_4;
    a0->field_e = a1->field_5;
    v10 = a1->field_10;
    if (v10)
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign((char *)&a0[1].field_0 + 1, v10 + 24, (int)v10[20]);
    v11 = a1->field_48;
    if (v11)
    {
        *(uint128_t *)((char *)&v3 + 224) = 0;
        *(uint128_t *)((char *)&v3 + 240) = 0;
        *(uint128_t *)((char *)&v3 + 192) = 0;
        *(uint128_t *)((char *)&v3 + 208) = 0;
        *(uint128_t *)((char *)&v3 + 160) = 0;
        *(uint128_t *)((char *)&v3 + 176) = 0;
        *(uint128_t *)((char *)&v3 + 128) = 0;
        *(uint128_t *)((char *)&v3 + 144) = 0;
        *(uint128_t *)((char *)&v3 + 96) = 0;
        *(uint128_t *)((char *)&v3 + 112) = 0;
        *(uint128_t *)((char *)&v3 + 64) = 0;
        *(uint128_t *)((char *)&v3 + 80) = 0;
        *(uint128_t *)((char *)&v3 + 32) = 0;
        *(uint128_t *)((char *)&v3 + 48) = 0;
        *(uint128_t *)&v3 = 0;
        *(uint128_t *)((char *)&v3 + 16) = 0;
        v12 = v11;
        v13 = (char)v12[24];
        v14 = v12 + 24;
        v15 = (int)v11[20];
        v1 = &v0;
        v0 = &v1;
        switch (v13)
        {
        case 64:
            if ((unsigned int)v15 > 0x100)
            {
                v5 = CONCAT(9976379690625781718, 8656108594398930691);
                v6 = CONCAT(9976379690625781718, 8656108594400626989);
                v5 ^= v6;
                *(unsigned short *)&v3 = *(unsigned short *)&v5;
                v4 = (char[256])_INSERT(v3, 2, *(char *)((void*)&v5 + 2));
                v5 = (void*)0;
                v20 = (char *)v14 + v15;
                if (32 > &v4[231] - v11 - v15)
                {
                    v21 = 0;
                }
                else
                {
                    v3 = _INSERT(v4, 3, *(int128_t *)((char *)v20 - 252));
                    *(int128_t *)((char *)&v3 + 19) = *(int128_t *)((char *)v20 - 236);
                    *(int128_t *)((char *)&v3 + 35) = *(int128_t *)((char *)v20 - 220);
                    *(int128_t *)((char *)&v3 + 0x33) = *(int128_t *)((char *)v20 - 0xcc);
                    *(int128_t *)((char *)&v3 + 67) = *(int128_t *)((char *)v20 - 188);
                    *(int128_t *)((char *)&v3 + 83) = *(int128_t *)((char *)v20 - 172);
                    *(int128_t *)((char *)&v3 + 99) = *(int128_t *)((char *)v20 - 156);
                    *(int128_t *)((char *)&v3 + 115) = *(int128_t *)((char *)v20 - 140);
                    *(int128_t *)((char *)&v3 + 131) = *(int128_t *)((char *)v20 - 124);
                    *(int128_t *)((char *)&v3 + 147) = *(int128_t *)((char *)v20 - 108);
                    *(int128_t *)((char *)&v3 + 163) = *(int128_t *)((char *)v20 - 92);
                    *(int128_t *)((char *)&v3 + 179) = *(int128_t *)((char *)v20 - 76);
                    *(int128_t *)((char *)&v3 + 195) = *(int128_t *)((char *)v20 - 60);
                    *(int128_t *)((char *)&v3 + 211) = *(int128_t *)((char *)v20 - 44);
                    *(double *)((char *)&v3 + 227) = *(double *)((char *)v20 - 28);
                    *(double *)((char *)&v3 + 235) = *(double *)((char *)v20 - 20);
                    v4 = (char[256])_INSERT(v3, 243, *(double *)((char *)v20 - 12));
                    v21 = 248;
                }
                do
                {
                    *(char *)(&v4[3] + v21) = *(char *)(v20 - 252 + v21);
                    v21 += 1;
                } while (v21 != 252);
LABEL_127064:
                v3 = _INSERT(v4, 0xff, 0);
                break;
            }
            else
            {
                break;
            }
        case 61:
            if ((unsigned int)v15 < 0x101)
                break;
            if (32 > (char *)&v0 + 7 - v11)
            {
                v16 = 0;
                v4 = v3;
            }
            else
            {
                v17 = v11 + 0x101;
                *(int128_t *)&v3 = (int128_t)v11[25];
                *(int128_t *)((char *)&v3 + 16) = (int128_t)v11[41];
                *(int128_t *)((char *)&v3 + 32) = (int128_t)v11[57];
                *(int128_t *)((char *)&v3 + 48) = (int128_t)v11[73];
                *(int128_t *)((char *)&v3 + 64) = (int128_t)v11[89];
                *(int128_t *)((char *)&v3 + 80) = (int128_t)v11[105];
                *(int128_t *)((char *)&v3 + 96) = (int128_t)v11[121];
                *(int128_t *)((char *)&v3 + 112) = (int128_t)v11[137];
                *(int128_t *)((char *)&v3 + 128) = (int128_t)v11[0x99];
                *(int128_t *)((char *)&v3 + 144) = (int128_t)v11[169];
                *(int128_t *)((char *)&v3 + 160) = (int128_t)v11[185];
                *(int128_t *)((char *)&v3 + 176) = (int128_t)v11[201];
                *(int128_t *)((char *)&v3 + 192) = (int128_t)v11[217];
                *(int128_t *)((char *)&v3 + 208) = (int128_t)v11[233];
                *(double *)((char *)&v3 + 224) = (double)v11[249];
                *(double *)((char *)&v3 + 232) = *(double *)v17;
                v16 = 248;
                v4 = _INSERT(v3, 240, *(double *)&v17[1]);
            }
            do
            {
                *(char *)(&v4 + v16) = *(char *)(v11 + 25 + v16);
                v16 += 1;
            } while (v16 != 0xff);
            goto LABEL_127064;
        default:
            v5 = CONCAT(9976379690625781718, 8656108594400625703);
            v6 = CONCAT(9976379690625781718, 8656108594400626989);
            v5 ^= v6;
            v18 = _strcspn(v14, &v5);
            if ((unsigned long long)v18 < 241)
                n = v18;
            else
                n = 241;
            v2 = CONCAT(0x8a733878b42bcff4, 6361266917583420022);
            v6 = CONCAT(3360228458095079394, 0xa12c20bed0ff9e86);
            v5 = CONCAT(11876789921865900084, 15640029920947279787);
            v2 ^= v6;
            v2 ^= v5;
            _strcpy();
            v2 = (void*)0;
            if (*((char *)v14 + n))
            {
                _strncat(&v3, v14, n);
                v2 = CONCAT(9976379690625781718, 8656108594398930691);
                v6 = CONCAT(0x465529ca75b5aff2, 7083671755876830902);
                v5 = CONCAT(14710464692302536740, 1904720318706288539);
                v2 ^= v6;
                v2 ^= v5;
                _strcat(&v3, &v2);
                v2 = (void*)0;
            }
            else
            {
                _strcat(&v3, v14);
            }
            v2 = CONCAT(9976379690625781718, 8656108594400646159);
            v6 = CONCAT(0x465529ca75b5aff2, 7083671755876830902);
            v5 = CONCAT(14710464692302536740, 1904720318706288539);
            v2 ^= v6;
            v2 ^= v5;
            _strcat(&v3, &v2);
            v2 = (void*)0;
            break;
        }
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign((char *)&a0[2].field_8 + 2);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign((char *)&a0[4].field_0 + 4, a1->field_48 + 24, (int)a1->field_48[20]);
    }
    if (*(long long *)&g_10002b0 == v7)
        return a0;
    __Unwind_Resume(___stack_chk_fail());
}
