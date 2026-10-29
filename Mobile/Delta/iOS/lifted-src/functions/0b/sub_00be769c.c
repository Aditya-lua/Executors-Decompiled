/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe769c..0xbe7850 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be769c_0 {
    char padding_0[8];
    struct st_be769c_1 *field_8;
} st_be769c_0;

typedef struct st_be769c_2 {
    char padding_0[24];
    struct st_be769c_1 *field_18;
} st_be769c_2;

typedef struct st_be769c_1 {
    unsigned long long field_0;
} st_be769c_1;


unsigned long long sub_be769c(unsigned long long a0, st_be769c_2 *a1, void* a2, st_be769c_0 *a3)
{
    unsigned long v7;  // x8
    unsigned long long v8;  // x25
    void* iter;  // x22
    unsigned int v10;  // w9
    unsigned long long v11;  // x10
    unsigned long long v12;  // x11
    unsigned long long v0;  // [bp-0x68]
    st_be769c_2 *v1;  // [bp-0x60]
    unsigned int v2;  // [bp-0x58], Other Possible Types: unsigned long long
    unsigned short v3;  // [bp-0x54]
    unsigned short v4;  // [bp-0x52]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!(a3 & 0x1))
    {
        v7 = *(char *)a2;
        if (!(unsigned int)v7)
            return 0;
        v8 = 0;
        iter = a2 + 1;
        if (!(v7 >> 7 & 1))
        {
            a1->field_18();
        }
        else if ((unsigned int)v7 == 128)
        {
            a1->field_18();
        }
        else if ((unsigned int)v7 == 192)
        {
            v1 = a1;
            v2 = 1610612768;
            v0 = a0;
            a3->field_8();
        }
        else
        {
            if (!(v7 & 1))
            {
                v10 = 1610612768;
                if (!(v7 >> 1 & 1))
                    goto LABEL_be779c;
LABEL_be7758:
                v11 = *(short *)iter;
                iter += 2;
                if (!(v7 >> 2 & 1))
                    goto LABEL_be77a4;
LABEL_be7760:
                v12 = *(short *)iter;
                iter += 2;
                if (v7 >> 3 & 1)
                    goto LABEL_be77ac;
            }
            else
            {
                v10 = (int)a2[1];
                iter = a2 + 5;
                if (v7 >> 1 & 1)
                    goto LABEL_be7758;
LABEL_be779c:
                v11 = 0;
                if (v7 >> 2 & 1)
                    goto LABEL_be7760;
LABEL_be77a4:
                v12 = 0;
                if (v7 >> 3 & 1)
                {
LABEL_be77ac:
                    v8 = *(short *)iter;
                }
            }
            if (v7 >> 4 & 1)
            {
                v11 = (short)a3[v11].field_8;
                if (v7 >> 5 & 1)
                {
LABEL_be77b8:
                    v12 = (short)a3[v12].field_8;
                }
            }
            else if (!(!(v7 >> 5 & 1)))
            {
                goto LABEL_be77b8;
            }
            v2 = v10;
            v3 = v11;
            v4 = v12;
            v0 = a0;
            v1 = a1;
            a3[v8].field_8();
        }
    }
    else
    {
        goto *((void *)(a1->field_18));
    }
}
