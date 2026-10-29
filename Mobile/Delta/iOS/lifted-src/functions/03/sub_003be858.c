/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3be858..0x3c0a7c (8740 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3be858_1 {
    char padding_0[80];
    struct st_3be858_2 *field_50;
    char padding_58[40];
    unsigned long long field_80;
} st_3be858_1;

typedef struct st_3be858_2 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_3be858_2;

typedef struct st_3be858_0 {
    char field_0;
} st_3be858_0;

typedef struct st_3be858_4 {
    unsigned long long field_0;
} st_3be858_4;

typedef struct st_3be858_3 {
    char padding_0[24];
    struct st_3be858_4 *field_18;
    struct st_3be858_4 *field_20;
    char padding_28[64];
    struct st_3be858_4 *field_68;
    char padding_70[264];
    struct st_3be858_4 *field_178;
} st_3be858_3;

extern st_3be858_3 *g_f0d3d8;
extern char g_10002b0;

void sub_3be858(st_3be858_1 *a0, void* a1, unsigned long a2, char *a3, unsigned long a4, unsigned int a5)
{
    unsigned long long v37;  // x28
    unsigned long long v38;  // x27
    unsigned long long v47;  // x30
    unsigned long long *v48;  // x10
    unsigned int v49;  // w9
    char *v50;  // x22
    long long v51;  // x0
    long long n;  // x23
    void* v53;  // x9
    unsigned long v54;  // x23
    char *v55;  // x8
    char *v56;  // x8
    unsigned long long v39;  // x26
    unsigned long long v59;  // 4118
    unsigned long long v40;  // x25
    unsigned long long v41;  // x24
    unsigned long long v42;  // x23
    unsigned long long v43;  // x22
    unsigned long long v44;  // x21
    unsigned long long v45;  // x20
    unsigned long long v46;  // x19
    unsigned long long v0;  // [bp-0x2c8]
    unsigned long long *v1;  // [bp-0x2c0]
    int v2;  // [bp-0x2b4], Other Possible Types: unsigned int
    unsigned long v3;  // [bp-0x270]
    unsigned int v4;  // [bp-0x254]
    st_3be858_0 **v5;  // [bp-0x220], Other Possible Types: char
    st_3be858_0 *v6;  // [bp-0x218]
    uint128_t v7;  // [bp-0x210], Other Possible Types: uint128_t
    st_3be858_0 **v8;  // [bp-0x1d0], Other Possible Types: char
    st_3be858_0 *v9;  // [bp-0x1c8]
    uint128_t iter;  // [bp-0x1c0], Other Possible Types: int, unsigned long, uint128_t
    unsigned long v11;  // [bp-0x1bc]
    unsigned long v12;  // [bp-0x1b8]
    unsigned int v13;  // [bp-0x1b4]
    unsigned long v14;  // [bp-0x1b0]
    uint128_t node;  // [bp-0x1a0], Other Possible Types: unsigned long, uint128_t
    char v16;  // [bp-0x180]
    unsigned short v17;  // [bp-0x170]
    char v18;  // [bp-0x16e]
    unsigned long v19;  // [bp-0x16d]
    unsigned long v20;  // [bp-0x165]
    unsigned long v21;  // [bp-0x15f]
    char v22;  // [bp-0x81]
    unsigned long v23;  // [bp-0x78]
    unsigned long long v24;  // [bp-0x60]
    unsigned long long v25;  // [bp-0x58]
    unsigned long long v26;  // [bp-0x50]
    unsigned long long v27;  // [bp-0x48]
    unsigned long long v28;  // [bp-0x40]
    unsigned long long v29;  // [bp-0x38]
    unsigned long long v30;  // [bp-0x30]
    unsigned long long v31;  // [bp-0x28]
    unsigned long long v32;  // [bp-0x20]
    unsigned long long v33;  // [bp-0x18]
    char *v34;  // [bp-0x10]
    unsigned long long v35;  // [bp-0x8]
    char v36;  // [bp+0x0]

    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = v41;
    v29 = v42;
    v30 = v43;
    v31 = v44;
    v32 = v45;
    v33 = v46;
    v34 = &v36;
    v35 = v47;
    v23 = *(long long *)&g_10002b0;
    v6 = &v5;
    v5 = &v6;
    v48 = &a0->field_50->field_0;
    if (*v48 <= v48[1])
        g_f0d3d8->field_68();
    v0 = *v48;
    v1 = v48;
    *v48 = 0xffffffffffffffff;
    v4 = *a3;
    *(unsigned long long *)&v16 = 0;
    *(unsigned long long *)&(&v16)[8] = 0;
    *(unsigned int *)&(&v16)[23] = 0;
    *(unsigned long long *)&(&v16)[16] = 0;
    *(unsigned int *)&v16 = (unsigned int)(8.238010263e-315 >> 0);
    *(unsigned long long *)&iter = 0;
    if (26 >= *(unsigned long long *)&iter)
    {
        do
        {
            (&v16)[*(unsigned long long *)&iter] = (char)((char)*(unsigned long long *)&iter + 208 + (&v16)[*(unsigned long long *)&iter] - ((char)*(unsigned long long *)&iter + 208 & (&v16)[*(unsigned long long *)&iter]) * 2) + 80;
            *(unsigned long long *)&iter = *(unsigned long long *)&iter + 1;
        } while (*(unsigned long long *)&iter < 27);
    }
    if (*(unsigned int *)&v16 == v4)
    {
        v9 = &v8;
        v8 = &v9;
        v49 = *(char *)a1;
        switch (v49)
        {
        case 64:
            if (a2 > 0x100)
            {
                node = CONCAT(9976833345430863802, 8655654939390078695);
                iter = CONCAT(9976833345430863802, 8655654939388625097);
                node ^= iter;
                *(unsigned short *)&v16 = *(unsigned short *)&node;
                (&v16)[2] = *(char *)((void*)&node + 2);
                node = 0;
                v53 = a1 + a2;
                *(int128_t *)&(&v16)[195] = *(int128_t *)((char *)v53 - 60);
                *(int128_t *)&(&v16)[211] = *(int128_t *)((char *)v53 - 44);
                *(int128_t *)&(&v16)[227] = *(int128_t *)((char *)v53 - 28);
                *(int128_t *)&(&v16)[239] = *(int128_t *)((char *)v53 - 16);
                *(int128_t *)&(&v16)[131] = *(int128_t *)((char *)v53 - 124);
                *(int128_t *)&(&v16)[147] = *(int128_t *)((char *)v53 - 108);
                *(int128_t *)&(&v16)[163] = *(int128_t *)((char *)v53 - 92);
                *(int128_t *)&(&v16)[179] = *(int128_t *)((char *)v53 - 76);
                *(int128_t *)&(&v16)[67] = *(int128_t *)((char *)v53 - 188);
                *(int128_t *)&(&v16)[83] = *(int128_t *)((char *)v53 - 172);
                *(int128_t *)&(&v16)[99] = *(int128_t *)((char *)v53 - 156);
                *(int128_t *)&(&v16)[115] = *(int128_t *)((char *)v53 - 140);
                *(int128_t *)&(&v16)[3] = *(int128_t *)((char *)v53 - 252);
                *(int128_t *)&(&v16)[19] = *(int128_t *)((char *)v53 - 236);
                *(int128_t *)&(&v16)[35] = *(int128_t *)((char *)v53 - 220);
                *(int128_t *)&(&v16)[0x33] = *(int128_t *)((char *)v53 - 0xcc);
LABEL_3bec58:
                v50 = &v16;
                v22 = 0;
                break;
            }
            else
            {
                v50 = a1 + 1;
                break;
            }
        case 61:
            v50 = a1 + 1;
            if (a2 < 0x101)
                break;
            *(int128_t *)&(&v16)[192] = *(int128_t *)&v50[192];
            *(int128_t *)&(&v16)[208] = *(int128_t *)&v50[208];
            *(int128_t *)&(&v16)[224] = *(int128_t *)&v50[224];
            *(int128_t *)&(&v16)[239] = *(int128_t *)&v50[239];
            *(int128_t *)&(&v16)[128] = *(int128_t *)&v50[128];
            *(int128_t *)&(&v16)[144] = *(int128_t *)&v50[144];
            *(int128_t *)&(&v16)[160] = *(int128_t *)&v50[160];
            *(int128_t *)&(&v16)[176] = *(int128_t *)&v50[176];
            *(int128_t *)&(&v16)[64] = *(int128_t *)&v50[64];
            *(int128_t *)&(&v16)[80] = *(int128_t *)&v50[80];
            *(int128_t *)&(&v16)[96] = *(int128_t *)&v50[96];
            *(int128_t *)&(&v16)[112] = *(int128_t *)&v50[112];
            *(int128_t *)&v16 = *(int128_t *)v50;
            *(int128_t *)&(&v16)[16] = *(int128_t *)&v50[16];
            *(int128_t *)&(&v16)[32] = *(int128_t *)&v50[32];
            *(int128_t *)&(&v16)[48] = *(int128_t *)&v50[48];
            goto LABEL_3bec58;
        default:
            node = CONCAT(9976833345430863802, 8655654939388628419);
            iter = CONCAT(9976833345430863802, 8655654939388625097);
            node ^= iter;
            v51 = _strcspn(a1, &node);
            if ((unsigned long long)v51 < 241)
                n = v51;
            else
                n = 241;
            v7 = CONCAT(9976833345430863768, 6374983981647606674);
            iter = CONCAT(5067529635761347186, 7093802998372011198);
            node = CONCAT(14710918347759576520, 1904266663038930039);
            v7 ^= iter;
            v7 ^= node;
            _strcpy();
            v7 = 0;
            if (*((char *)a1 + n))
            {
                _strncat(&v16, a1, n);
                v7 = CONCAT(9976833345430863802, 8655654939390078695);
                iter = CONCAT(0x2ea0a70ace67ff62, 0xa115ff8e4c58394e);
                node = CONCAT(0xa4d4721bbfca40d8, 15639576266137762183);
                v7 ^= iter;
                v7 ^= node;
                _strcat(&v16, &v7);
                v7 = 0;
            }
            else
            {
                _strcat(&v16, a1);
            }
            v7 = CONCAT(9976833345430863802, 8655654939388616171);
            iter = CONCAT(0x2ea0a70ace67ff62, 0xa115ff8e4c58394e);
            node = CONCAT(0xa4d4721bbfca40d8, 15639576266137762183);
            v7 ^= iter;
            v7 ^= node;
            v50 = &v16;
            _strcat(&v16, &v7);
            v7 = 0;
            break;
        }
        if (a4 < 1)
            v54 = 0;
        else
            v54 = a4 - 1;
        iter = 0;
        v12 = 0;
        v14 = 0;
        v55 = v50;
        do
        {
            v56 = v55;
            v55 = v56 + 1;
        } while (*v56);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(&iter);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&iter, v50, _strlen(v50));
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&iter, a3 + 1, v54);
        sub_a0c8(&iter);
        sub_6b08(&iter);
        g_f0d3d8->field_18();
    }
    else
    {
        if (v4 != 100)
        {
            v59 = arm64g_calculate_condition(129, v4 - 15, 13, 0);
            if (!(v59 & 1))
            {
                v16 = 0x86898a9690baf98280908dadb1b2b0bb;
                v17 = 36490;
                v18 = 16;
                v20 = 0;
                v19 = 0;
                iter = 0;
                if (0x22 >= iter)
                {
                    do
                    {
                        (&v16)[iter] = (char)iter + 91 + (&v16)[iter] - ((char)iter + 91 & (&v16)[iter]) * 2 - 125;
                        iter += 1;
                    } while (iter < 35);
                }
                _strlen(&v16);
                g_f0d3d8->field_18();
            }
        }
        if (v4 >= 4)
        {
            v2 = a3[1];
            iter = (unsigned int)(5.57446603e-315 >> 0);
            v11 = 0;
            v13 = 0;
            node = 0;
            if (15 >= node)
            {
                do
                {
                    *((char *)&iter + node) = (char)((char)node + 203 + *((char *)&iter + node) - ((char)node + 203 & *((char *)&iter + node)) * 2) + 115;
                    node += 1;
                } while (node < 16);
            }
            if (iter <= v2)
            {
                *(unsigned long long *)&v16 = 0;
                *(unsigned long long *)&(&v16)[8] = 0;
                *(unsigned long long *)&(&v16)[13] = 0;
                *(unsigned int *)&v16 = (unsigned int)(6.238889925e-315 >> 0);
                node = 0;
                if (20 >= node)
                {
                    do
                    {
                        (&v16)[node] = (char)node + 53 + (&v16)[node] - ((char)node + 53 & (&v16)[node]) * 2 - 115;
                        node += 1;
                    } while (node < 21);
                }
                if (v2 > (int)*(unsigned int *)&v16)
                    goto LABEL_3bef18;
                if (a5)
                {
LABEL_3bee48:
                    g_f0d3d8->field_178();
                }
            }
            else
            {
LABEL_3bef18:
                v16 = 0x96898ae6e0fab9f2f0e0edede1e2e0fb;
                v17 = 36490;
                v18 = 32;
                v20 = 0;
                v19 = 0;
                v21 = 0;
                iter = 0;
                if (40 >= iter)
                {
                    do
                    {
                        (&v16)[iter] = (char)((char)iter + 179 + (&v16)[iter] - ((char)iter + 179 & (&v16)[iter]) * 2) + 27;
                        iter += 1;
                    } while (iter < 41);
                }
                _strlen(&v16);
                g_f0d3d8->field_18();
            }
        }
        else
        {
            v2 = 0;
            if (a5)
                goto LABEL_3bee48;
        }
        v3 = a0->field_80;
        g_f0d3d8->field_20();
    }
}
