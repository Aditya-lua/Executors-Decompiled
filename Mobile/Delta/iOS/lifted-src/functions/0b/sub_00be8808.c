/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe8808..0xbe8a94 (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e0eb50;

void* sub_be8808(void* a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v6;  // x1
    unsigned short v7;  // x9
    unsigned long long v16;  // x20
    unsigned int v17;  // w9
    unsigned long long v18;  // x9
    unsigned long long v19;  // x9
    unsigned long long v20;  // x10
    unsigned long long v21;  // x11
    char *v22;  // x8
    unsigned int v8;  // w8
    unsigned long long v9;  // x8
    unsigned long long v10;  // x9
    unsigned long long v11;  // x8
    unsigned long long v12;  // x10
    char *v13;  // x9
    void* v15;  // x19
    unsigned long v0;  // [bp-0x34]
    unsigned short v1;  // [bp-0x2c]
    unsigned long v2;  // [bp-0x2a]
    unsigned short v3;  // [bp-0x22]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if ((int)a1 > 12)
    {
        if (38 >= (int)a1)
        {
            if ((unsigned int)a1 != 13)
            {
                if ((unsigned int)a1 != 0x22)
                    goto LABEL_be8898;
                v6 = a1;
                if (((unsigned int)a2 & 0xffffff) < 0x10000)
                    goto LABEL_be8980;
                v7 = 8796;
            }
            else
            {
                v7 = 29276;
            }
        }
        else
        {
            if ((unsigned int)a1 == 39)
            {
                v6 = a1;
                if (!(a2 >> 8 & 1))
                {
LABEL_be8980:
                    v15 = a0;
                    v16 = v6;
                    if (sub_be8a94(v6) & 1)
                    {
                        *(unsigned int *)v15 = v16;
                        a0 = v15;
                        *(char *)&a0[12] = 128;
                        *(char *)&a0[13] = 129;
                        return a0;
                    }
                    v17 = (unsigned int)v16 | 1;
                    if (!(v17 * 0x100000000))
                        v18 = 32;
                    else
                        v18 = Clz(v17 * 0x100000000) & 0xffffffff;
                    v19 = v18 >> 2;
                    v20 = v19 - 2;
                    *((char *)&v2 + 2) = 0;
                    *(unsigned short *)&v2 = 0;
                    v21 = v16 & 0xffffffff;
                    *((char *)&v2 + 3) = (&g_e0eb50)[v21 >> 20];
                    *((char *)&v2 + 4) = (&g_e0eb50)[(v16 * 0x1000000000000 | v16 >> 16) & 0xffff00000000000f & 15];
                    *((char *)&v2 + 5) = (&g_e0eb50)[(v16 * 0x10000000000000 | v16 >> 12) & 0xfff000000000000f & 15];
                    *((char *)&v2 + 6) = (&g_e0eb50)[(v16 * 0x100000000000000 | v16 >> 8) & 0xff0000000000000f & 15];
                    *((char *)&v2 + 7) = (&g_e0eb50)[(v16 * 0x1000000000000000 | v16 >> 4) & 17293822569102704655 & 15];
                    *(char *)&v3 = (&g_e0eb50)[v21 & 15];
                    *((char *)&v2 + v20) = 92;
                    *((char *)&v3 + 1) = 125;
                    v22 = (char *)&v2 + v19;
                    *(v22 - 1) = 117;
                    *v22 = 123;
                    *(unsigned long *)v15 = v2;
                    *(unsigned short *)&v15[8] = v3;
                    a0 = v15;
                    *(char *)&a0[12] = v20;
                    *(char *)&a0[13] = 10;
                    return a0;
                }
                v7 = 10076;
            }
            else if ((unsigned int)a1 == 92)
            {
                v7 = 0x5c5c;
            }
            else
            {
LABEL_be8898:
                v6 = a1;
                if (a2 & 1)
                {
                    v6 = a1;
                    if ((unsigned int)v6 > 0x2ff)
                    {
                        v6 = a1;
                        if (sub_be8df8(a1))
                        {
                            v8 = (unsigned int)v6 | 1;
                            if (!(v8 * 0x100000000))
                                v9 = 32;
                            else
                                v9 = Clz(v8 * 0x100000000) & 0xffffffff;
                            v10 = v9 >> 2;
                            v11 = v10 - 2;
                            *((char *)&v0 + 2) = 0;
                            v12 = v6 & 0xffffffff;
                            *((char *)&v0 + 3) = (&g_e0eb50)[v12 >> 20];
                            *((char *)&v0 + 4) = (&g_e0eb50)[(v6 * 0x1000000000000 | v6 >> 16) & 0xffff00000000000f & 15];
                            *(unsigned short *)&v0 = 0;
                            *((char *)&v0 + 5) = (&g_e0eb50)[(v6 * 0x10000000000000 | v6 >> 12) & 0xfff000000000000f & 15];
                            *((char *)&v0 + 6) = (&g_e0eb50)[(v6 * 0x100000000000000 | v6 >> 8) & 0xff0000000000000f & 15];
                            *((char *)&v0 + 7) = (&g_e0eb50)[(v6 * 0x1000000000000000 | v6 >> 4) & 17293822569102704655 & 15];
                            v1 = CONCAT(125, (&g_e0eb50)[v12 & 15]);
                            *((char *)&v0 + v11) = 92;
                            v13 = (char *)&v0 + v10;
                            *(v13 - 1) = 117;
                            *v13 = 123;
                            *(unsigned long *)a0 = v0;
                            *(unsigned short *)&a0[8] = v1;
                            *(char *)&a0[12] = v11;
                            *(char *)&a0[13] = 10;
                            return a0;
                        }
                    }
                }
                goto LABEL_be8980;
            }
        }
    }
    else
    {
        if (!(unsigned int)a1)
        {
            v7 = 12380;
        }
        else if ((unsigned int)a1 != 9)
        {
            if ((unsigned int)a1 != 10)
                goto LABEL_be8898;
            v7 = 28252;
        }
        else
        {
            v7 = 29788;
        }
    }
    *(unsigned short *)a0 = v7;
    *(unsigned long long *)&a0[2] = 0;
    *(char *)&a0[12] = 0;
    *(char *)&a0[13] = 2;
    return a0;
}
