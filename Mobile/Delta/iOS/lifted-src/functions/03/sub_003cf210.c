/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cf210..0x3cf69c (1164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cf210_0 {
    char field_0;
} st_3cf210_0;

typedef struct st_3cf210_1 {
    unsigned long long field_0;
} st_3cf210_1;

extern char g_d0d9cc;
extern unsigned long long g_e7f210;
extern unsigned long long g_e7f2f0;
extern st_3cf210_1 *g_f0b120;

unsigned int sub_3cf210(long long a0, void* a1, long long a2, unsigned long a3)
{
    long long idx;  // x24
    unsigned int v7;  // w25
    unsigned long long v16;  // x0
    unsigned int v17;  // w8
    unsigned long long v18;  // x22
    unsigned int v19;  // x26
    unsigned long v20;  // x23
    unsigned int v21;  // w0
    unsigned int v22;  // x8
    unsigned long index;  // x25
    unsigned int v24;  // w8
    unsigned int v8;  // w9
    unsigned long v9;  // x21
    unsigned int v10;  // w22
    unsigned long v11;  // x21
    unsigned long idx1;  // x26
    unsigned int v13;  // w8
    unsigned short v14;  // x8
    unsigned int v15;  // w8
    unsigned int v0;  // [bp-0x84]
    unsigned int v1;  // [bp-0x74]
    st_3cf210_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_3cf210_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    idx = a0 + 0x4000;
    v3 = &v2;
    v2 = &v3;
    v7 = *(int *)(idx + 2100);
    if (!v7)
    {
        g_f0b120();
    }
    else if (*(int *)(idx + 2108))
    {
        v8 = *(int *)(idx + 2112);
        if (*(int *)(idx + 2116))
        {
            *(int *)(idx + 2116) = *(int *)(idx + 2116) - 1;
            if (*(int *)(idx + 2104) < (int)v7)
                return 1;
            v9 = v7;
            v10 = 0x10000 << ((char)v8 & 31);
            do
            {
                v11 = v9;
                idx1 = (&g_d0d9cc)[v11];
                if (*(short *)((char *)a1 + 2 * idx1) && sub_3d5f50(a0))
                {
                    v13 = *(short *)((char *)a1 + 2 * idx1);
                    if (!((int)(v10) >> 16 & v13))
                    {
                        if ((int)v13 < 1)
                            v14 = v13 - (v10 >> 16);
                        else
                            v14 = (unsigned short)v13 + (unsigned short)(v10 >> 16);
                        *(unsigned short *)((char *)a1 + 2 * idx1) = v14;
                    }
                }
            } while ((v9 = v11 + 1, *(int *)(idx + 2104) > (long long)v11));
            return 1;
        }
        v0 = v8;
        v15 = 0x10000 << ((char)v8 & 31);
        v1 = v15;
        while (1)
        {
            v16 = sub_3d1eb8(a0, a2);
            if (v16 >> 31 & 1)
                g_f0b120();
            v17 = (unsigned int)v16 & 15;
            v18 = (unsigned int)v16 >> 4;
            if (v17 == 1)
            {
                if (!sub_3d5f50(a0))
                    v22 = 0xffff;
                else
                    v22 = 1;
                v19 = (unsigned short)(v22 << ((char)v0 & 31));
                v20 = v7;
            }
            else if (v17)
            {
                g_f0b120();
            }
            else if (239 >= (unsigned int)v16)
            {
                *(unsigned int *)(idx + 2116) = ~(0xffffffff << ((char)v18 & 31));
                if (16 > (unsigned int)v16)
                {
                    v19 = 0;
                    v18 = 64;
                    v20 = v7;
                }
                else
                {
                    v21 = sub_3c9c6c(a0, v18);
                    v19 = 0;
                    *(unsigned int *)(idx + 2116) = *(int *)(idx + 2116) + v21;
                    v18 = 64;
                    v20 = v7;
                }
            }
            else
            {
                v19 = 0;
                v20 = v7;
            }
            if (*(int *)(idx + 2104) >= (long long)v20)
                break;
            v7 = v20;
            if (*(int *)(idx + 2104) < (int)v20)
                return 1;
        }
        index = (&g_d0d9cc)[v20];
        if (*(short *)((char *)a1 + 2 * index))
        {
            if (sub_3d5f50(a0))
            {
                v24 = *(short *)((char *)a1 + 2 * index);
                if (!((int)(v15) >> 16 & v24))
                {
                    if ((int)v24 >= 1)
                    {
                        *(unsigned short *)((char *)a1 + 2 * index) = (unsigned short)v24 + (unsigned short)(v1 >> 16);
                        goto *((void *)(g_e7f210));
                    }
                    else
                    {
                        *(unsigned short *)((char *)a1 + 2 * index) = v24 - (v1 >> 16);
                        goto *((void *)(g_e7f210));
                    }
                }
            }
            goto *((void *)(g_e7f210));
        }
        else if ((unsigned int)v18)
        {
            goto *((void *)(g_e7f210));
        }
        else
        {
            *(unsigned short *)((char *)a1 + 2 * index) = v19;
            goto *((void *)(g_e7f2f0));
        }
    }
    else
    {
        if (*(int *)(idx + 2116))
        {
            *(int *)(idx + 2116) = *(int *)(idx + 2116) - 1;
            return 1;
        }
        v1 = *(int *)(idx + 2112);
        g_f0b120();
    }
}
