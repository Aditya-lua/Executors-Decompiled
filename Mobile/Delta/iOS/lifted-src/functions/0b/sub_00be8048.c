/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe8048..0xbe827c (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be8048_2 {
    unsigned long long field_0;
    struct st_be8048_0 *field_8;
    struct st_be8048_3 *field_10;
} st_be8048_2;

typedef struct st_be8048_0 {
    char padding_0[24];
    struct st_be8048_1 *field_18;
} st_be8048_0;

typedef struct st_be8048_1 {
    unsigned long long field_0;
} st_be8048_1;

typedef struct st_be8048_3 {
    char field_0;
} st_be8048_3;


char sub_be8048(st_be8048_2 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v5;  // x21
    char v6;  // x25
    char v15;  // x9
    char v16;  // x9
    char v17;  // x8
    char v7;  // x9
    char *v8;  // x8
    char iter;  // x11
    char *v10;  // x10
    char v11;  // x10
    char v12;  // x11
    unsigned long long *v13;  // x12
    unsigned long v14;  // x12
    st_be8048_0 *v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x70]
    char *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    v6 = 0;
    v1 = a0->field_0;
    v2 = a0->field_10;
    v0 = a0->field_8;
    while (1)
    {
        if (v5 < v6)
        {
LABEL_be8204:
            if (!v5)
            {
                return 0;
            }
            else if (*v2 & 1)
            {
                v0->field_18();
            }
LABEL_be8240:
            if (v5)
            {
                v17 = *(char *)(a1 + v5 - 1) == 10;
                break;
            }
            else
            {
                v17 = 0;
                break;
            }
        }
        v7 = v5 - v6;
        v8 = a1 + v6;
        if (15 >= v7)
        {
            if (v5 != v6)
            {
                iter = 0;
                do
                {
                    if (v8[iter] == 10)
                        goto LABEL_be81c8;
                } while ((iter += 1, v7 != iter));
            }
            goto LABEL_be8200;
        }
        else
        {
            v10 = v8 + 7 & 0xfffffffffffffff8;
            v11 = v10 - v8;
            if (v10 == v8)
            {
                v12 = v7 - 16;
                while (1)
                {
                    v13 = &v8[v11];
                    v14 = v13[1] ^ 0xa0a0a0a0a0a0a0a;
                    if (!(~((0x101010101010100 - (*v13 ^ 0xa0a0a0a0a0a0a0a) | *v13) & (0x101010101010100 - v14 | v14)) & 0x8080808080808080))
                    {
                        v11 += 16;
LABEL_be8154:
                        if (v12 < v11)
                            goto LABEL_be8190;
                    }
                    else
                    {
LABEL_be8190:
                        if (v7 != v11)
                        {
                            v15 = 0;
                            do
                            {
                                if (v8[v15 + v11] == 10)
                                {
                                    iter = v15 + v11;
                                    goto LABEL_be81c8;
                                }
                            } while ((v15 += 1, v5 - v11 - v6 != v15));
                        }
                    }
                }
LABEL_be8200:
                goto LABEL_be8204;
            }
            else
            {
                iter = 0;
                while (v8[iter] != 10)
                {
                    if (v11 == iter + 1)
                    {
                        v12 = v7 - 16;
                        goto LABEL_be8154;
                    }
                }
LABEL_be81c8:
                v16 = v6 + iter;
                v6 = v16 + 1;
                if (v5 > v16 && v8[iter] == 10)
                {
                    v5 = v6;
                    if (*v2 & 1)
                        v0->field_18();
                    goto LABEL_be8240;
                }
            }
        }
    }
    *v2 = v17;
    v0->field_18();
}
