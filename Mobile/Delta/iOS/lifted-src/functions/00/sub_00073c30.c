/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x73c30..0x73e28 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_73c30_1 {
    char padding_0[32];
    struct st_73c30_2 *field_20;
} st_73c30_1;

typedef struct st_73c30_3 {
    char padding_0[28];
    unsigned int field_1c;
    char padding_20[56];
    unsigned long long field_58;
    unsigned long long field_60;
    char padding_68[8];
    char field_70;
    char padding_71[95];
    struct st_73c30_4 *field_d0;
    char field_d8;
    char padding_d9[479];
    char field_2b8;
    char padding_2b9[83];
    int field_30c;
} st_73c30_3;

typedef struct st_73c30_2 {
    unsigned long long field_0;
} st_73c30_2;

typedef struct st_73c30_4 {
    struct st_73c30_1 *field_0;
} st_73c30_4;

typedef struct st_73c30_0 {
    char field_0;
} st_73c30_0;


unsigned long long sub_73c30(st_73c30_3 *a0)
{
    unsigned long long t;  // x20
    unsigned int v5;  // w21
    unsigned long long v6;  // w0
    unsigned long long v8;  // x0
    st_73c30_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_73c30_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    t = std::__1::chrono::steady_clock::now();
    v5 = a0->field_1c;
    if (0 >= (int)a0->field_1c)
        v5 = a0->field_30c & ~(a0->field_30c >> 31);
    std::__1::mutex::lock(&a0->field_70);
    std::__1::mutex::unlock(&a0->field_70);
    if (a0->field_58 == a0->field_60)
        return 1;
    if (v5)
    {
        while (1)
        {
            if (sub_60768(&a0->field_2b8, 5) & 1)
                return 1;
            v6 = (unsigned int)sub_66080(a0->field_d0, 10);
            if (v6 != 1)
            {
                if (v6 == 2)
                {
                    if ((long long)(t + v5 * 1000000000) < std::__1::chrono::steady_clock::now())
                        sub_73700(a0, 1006, "Send timeout", 0, 0);
                }
                else
                {
                    if (v6 == 3)
                        break;
                }
            }
            else
            {
                if (!(sub_732c0(a0) & 1))
                    return 0;
            }
            std::__1::mutex::lock(&a0->field_70);
            std::__1::mutex::unlock(&a0->field_70);
            if (a0->field_58 == a0->field_60)
                return 1;
        }
    }
    else
    {
        while (1)
        {
            if (sub_60768(&a0->field_2b8, 5) & 1)
                return 1;
            switch ((unsigned int)sub_66080(a0->field_d0, 10))
            {
            case 1:
                v8 = sub_732c0(a0);
                if (!(unsigned int)v8)
                    return v8;
                goto LABEL_73d24;
            case 3:
                goto LABEL_73d6c;
            default:
LABEL_73d24:
                std::__1::mutex::lock(&a0->field_70);
                std::__1::mutex::unlock(&a0->field_70);
                if (a0->field_58 == a0->field_60)
                    return 1;
                break;
            }
        }
    }
LABEL_73d6c:
    std::__1::mutex::lock(&a0->field_d8);
    (*(long long *)(*(long long *)a0->field_d0 + 32))();
}
