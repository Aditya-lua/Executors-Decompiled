/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x34a28..0x362c8 (6304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_34a28_0 {
    char field_0;
} st_34a28_0;

extern unsigned int g_f0ccf8;
extern unsigned int g_f0cd18;

unsigned int sub_34a28(long long a0, unsigned long a1)
{
    st_34a28_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_34a28_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_36464() & 1)
    {
        return 1;
    }
    else if (sub_36464(a0, "type") & 1)
    {
        return 40;
    }
    else if (sub_36464(a0, "typeof") & 1)
    {
        return 44;
    }
    else if (sub_36464(a0, "rawset") & 1)
    {
        return 49;
    }
    else if (sub_36464(a0, "rawget") & 1)
    {
        return 50;
    }
    else if (sub_36464(a0, "rawequal") & 1)
    {
        return 0x33;
    }
    else if (sub_36464(a0, "rawlen") & 1)
    {
        return 58;
    }
    else if (sub_36464(a0, "unpack") & 1)
    {
        return 53;
    }
    else if (sub_36464(a0, "select") & 1)
    {
        return 57;
    }
    else if (sub_36464(a0, "getmetatable") & 1)
    {
        return 60;
    }
    else if (sub_36464(a0, "setmetatable") & 1)
    {
        return 61;
    }
    else if (sub_36464(a0, "tonumber") & 1)
    {
        return 62;
    }
    else if (sub_36464(a0, "tostring") & 1)
    {
        return 63;
    }
    else
    {
        if (sub_1935c(a0, "math"))
        {
            if (sub_1935c(a0 + 8, "abs") & 1)
            {
                return 2;
            }
            else if (sub_1935c(a0 + 8, "acos") & 1)
            {
                return 3;
            }
            else if (sub_1935c(a0 + 8, "asin") & 1)
            {
                return 4;
            }
            else if (sub_1935c(a0 + 8, "atan2") & 1)
            {
                return 5;
            }
            else if (sub_1935c(a0 + 8, "atan") & 1)
            {
                return 6;
            }
            else if (sub_1935c(a0 + 8, "ceil") & 1)
            {
                return 7;
            }
            else if (sub_1935c(a0 + 8, "cosh") & 1)
            {
                return 8;
            }
            else if (sub_1935c(a0 + 8, "cos") & 1)
            {
                return 9;
            }
            else if (sub_1935c(a0 + 8, "deg") & 1)
            {
                return 10;
            }
            else if (sub_1935c(a0 + 8, "exp") & 1)
            {
                return 11;
            }
            else if (sub_1935c(a0 + 8, "floor") & 1)
            {
                return 12;
            }
            else if (sub_1935c(a0 + 8, "fmod") & 1)
            {
                return 13;
            }
            else if (sub_1935c(a0 + 8, "frexp") & 1)
            {
                return 14;
            }
            else if (sub_1935c(a0 + 8, "ldexp") & 1)
            {
                return 15;
            }
            else if (sub_1935c(a0 + 8, "log10") & 1)
            {
                return 16;
            }
            else if (sub_1935c(a0 + 8, "log") & 1)
            {
                return 0x11;
            }
            else if (sub_1935c(a0 + 8, "max") & 1)
            {
                return 18;
            }
            else if (sub_1935c(a0 + 8, "min") & 1)
            {
                return 19;
            }
            else if (sub_1935c(a0 + 8, "modf") & 1)
            {
                return 20;
            }
            else if (sub_1935c(a0 + 8, "pow") & 1)
            {
                return 21;
            }
            else if (sub_1935c(a0 + 8, "rad") & 1)
            {
                return 22;
            }
            else if (sub_1935c(a0 + 8, "sinh") & 1)
            {
                return 23;
            }
            else if (sub_1935c(a0 + 8, "sin") & 1)
            {
                return 24;
            }
            else if (sub_1935c(a0 + 8, "sqrt") & 1)
            {
                return 25;
            }
            else if (sub_1935c(a0 + 8, "tanh") & 1)
            {
                return 26;
            }
            else if (sub_1935c(a0 + 8, "tan") & 1)
            {
                return 27;
            }
            else if (sub_1935c(a0 + 8, "clamp") & 1)
            {
                return 46;
            }
            else if (sub_1935c(a0 + 8, "sign") & 1)
            {
                return 47;
            }
            else if (sub_1935c(a0 + 8, "round") & 1)
            {
                return 48;
            }
            else if (sub_1935c(a0 + 8, "lerp") & 1)
            {
                return 89;
            }
            else if (sub_1935c(a0 + 8, "isnan") & 1)
            {
                return 91;
            }
            else if (sub_1935c(a0 + 8, "isinf") & 1)
            {
                return 92;
            }
            else if (sub_1935c(a0 + 8, "isfinite") & 1)
            {
                return 93;
            }
        }
        if (sub_1935c(a0, "bit32"))
        {
            if (sub_1935c(a0 + 8, "arshift") & 1)
            {
                return 28;
            }
            else if (sub_1935c(a0 + 8, "band") & 1)
            {
                return 29;
            }
            else if (sub_1935c(a0 + 8, "bnot") & 1)
            {
                return 30;
            }
            else if (sub_1935c(a0 + 8, "bor") & 1)
            {
                return 31;
            }
            else if (sub_1935c(a0 + 8, "bxor") & 1)
            {
                return 32;
            }
            else if (sub_1935c(a0 + 8, "btest") & 1)
            {
                return 33;
            }
            else if (sub_1935c(a0 + 8, "extract") & 1)
            {
                return 0x22;
            }
            else if (sub_1935c(a0 + 8, "lrotate") & 1)
            {
                return 35;
            }
            else if (sub_1935c(a0 + 8, "lshift") & 1)
            {
                return 36;
            }
            else if (sub_1935c(a0 + 8, "replace") & 1)
            {
                return 37;
            }
            else if (sub_1935c(a0 + 8, "rrotate") & 1)
            {
                return 38;
            }
            else if (sub_1935c(a0 + 8, "rshift") & 1)
            {
                return 39;
            }
            else if (sub_1935c(a0 + 8, "countlz") & 1)
            {
                return 55;
            }
            else if (sub_1935c(a0 + 8, "countrz") & 1)
            {
                return 56;
            }
            else if (sub_1935c(a0 + 8, "byteswap") & 1)
            {
                return 64;
            }
        }
        if (sub_1935c(a0, "string"))
        {
            if (sub_1935c(a0 + 8, "byte") & 1)
            {
                return 41;
            }
            else if (sub_1935c(a0 + 8, "char") & 1)
            {
                return 42;
            }
            else if (sub_1935c(a0 + 8, "len") & 1)
            {
                return 43;
            }
            else if (sub_1935c(a0 + 8, "sub") & 1)
            {
                return 45;
            }
        }
        if (sub_1935c(a0, "table"))
        {
            if (sub_1935c(a0 + 8, "insert") & 1)
            {
                return 52;
            }
            else if (sub_1935c(a0 + 8, "unpack") & 1)
            {
                return 53;
            }
        }
        if (sub_1935c(a0, "buffer"))
        {
            if (sub_1935c(a0 + 8, "readi8") & 1)
                return 65;
            if (sub_1935c(a0 + 8, "readu8") & 1)
                return 66;
            if (sub_1935c(a0 + 8, "writei8") & 1)
                return 67;
            if (sub_1935c(a0 + 8, "writeu8") & 1)
                return 67;
            if (sub_1935c(a0 + 8, "readi16") & 1)
                return 0x44;
            if (sub_1935c(a0 + 8, "readu16") & 1)
                return 69;
            if (sub_1935c(a0 + 8, "writei16") & 1)
                return 70;
            if (sub_1935c(a0 + 8, "writeu16") & 1)
                return 70;
            if (sub_1935c(a0 + 8, "readi32") & 1)
                return 71;
            if (sub_1935c(a0 + 8, "readu32") & 1)
                return 72;
            if (sub_1935c(a0 + 8, "writei32") & 1)
                return 73;
            if (sub_1935c(a0 + 8, "writeu32") & 1)
                return 73;
            if (sub_1935c(a0 + 8, "readf32") & 1)
                return 74;
            if (sub_1935c(a0 + 8, "writef32") & 1)
                return 75;
            if (sub_1935c(a0 + 8, "readf64") & 1)
                return 76;
            if (sub_1935c(a0 + 8, "writef64") & 1)
                return 77;
            if ((char)g_f0ccf8 == 1)
            {
                if ((char)g_f0cd18 == 1)
                {
                    if (sub_1935c(a0 + 8, "readinteger") & 1)
                        return 131;
                    if ((char)g_f0ccf8 & 1)
                        goto LABEL_3594c;
                }
                else
                {
LABEL_3594c:
                    if ((char)g_f0cd18 == 1 && sub_1935c(a0 + 8, "writeinteger") & 1)
                        return 132;
                }
            }
        }
        if (sub_1935c(a0, "vector"))
        {
            if (sub_1935c(a0 + 8, "create") & 1)
            {
                return 54;
            }
            else if (sub_1935c(a0 + 8, "magnitude") & 1)
            {
                return 78;
            }
            else if (sub_1935c(a0 + 8, "normalize") & 1)
            {
                return 79;
            }
            else if (sub_1935c(a0 + 8, "cross") & 1)
            {
                return 80;
            }
            else if (sub_1935c(a0 + 8, "dot") & 1)
            {
                return 81;
            }
            else if (sub_1935c(a0 + 8, "floor") & 1)
            {
                return 82;
            }
            else if (sub_1935c(a0 + 8, "ceil") & 1)
            {
                return 83;
            }
            else if (sub_1935c(a0 + 8, "abs") & 1)
            {
                return 84;
            }
            else if (sub_1935c(a0 + 8, "sign") & 1)
            {
                return 0x55;
            }
            else if (sub_1935c(a0 + 8, "clamp") & 1)
            {
                return 86;
            }
            else if (sub_1935c(a0 + 8, "min") & 1)
            {
                return 87;
            }
            else if (sub_1935c(a0 + 8, "max") & 1)
            {
                return 88;
            }
            else if (sub_1935c(a0 + 8, "lerp") & 1)
            {
                return 90;
            }
        }
        if ((char)g_f0ccf8 == 1 && sub_1935c(a0, "integer"))
        {
            if (sub_1935c(a0 + 8, "add") & 1)
            {
                return 97;
            }
            else if (sub_1935c(a0 + 8, "sub") & 1)
            {
                return 98;
            }
            else if (sub_1935c(a0 + 8, "mod") & 1)
            {
                return 107;
            }
            else if (sub_1935c(a0 + 8, "mul") & 1)
            {
                return 99;
            }
            else if (sub_1935c(a0 + 8, "div") & 1)
            {
                return 100;
            }
            else if (sub_1935c(a0 + 8, "idiv") & 1)
            {
                return 104;
            }
            else if (sub_1935c(a0 + 8, "udiv") & 1)
            {
                return 105;
            }
            else if (sub_1935c(a0 + 8, "rem") & 1)
            {
                return 103;
            }
            else if (sub_1935c(a0 + 8, "urem") & 1)
            {
                return 106;
            }
            else if (sub_1935c(a0 + 8, "min") & 1)
            {
                return 101;
            }
            else if (sub_1935c(a0 + 8, "max") & 1)
            {
                return 0x66;
            }
            else if (sub_1935c(a0 + 8, "neg") & 1)
            {
                return 96;
            }
            else if (sub_1935c(a0 + 8, "create") & 1)
            {
                return 94;
            }
            else if (sub_1935c(a0 + 8, "clamp") & 1)
            {
                return 108;
            }
            else if (sub_1935c(a0 + 8, "band") & 1)
            {
                return 109;
            }
            else if (sub_1935c(a0 + 8, "bor") & 1)
            {
                return 110;
            }
            else if (sub_1935c(a0 + 8, "bxor") & 1)
            {
                return 112;
            }
            else if (sub_1935c(a0 + 8, "bnot") & 1)
            {
                return 111;
            }
            else if (sub_1935c(a0 + 8, "btest") & 1)
            {
                return 127;
            }
            else if (sub_1935c(a0 + 8, "bswap") & 1)
            {
                return 130;
            }
            else if (sub_1935c(a0 + 8, "lt") & 1)
            {
                return 113;
            }
            else if (sub_1935c(a0 + 8, "le") & 1)
            {
                return 114;
            }
            else if (sub_1935c(a0 + 8, "ult") & 1)
            {
                return 115;
            }
            else if (sub_1935c(a0 + 8, "ule") & 1)
            {
                return 116;
            }
            else if (sub_1935c(a0 + 8, "gt") & 1)
            {
                return 117;
            }
            else if (sub_1935c(a0 + 8, "ge") & 1)
            {
                return 118;
            }
            else if (sub_1935c(a0 + 8, "ugt") & 1)
            {
                return 0x77;
            }
            else if (sub_1935c(a0 + 8, "uge") & 1)
            {
                return 120;
            }
            else if (sub_1935c(a0 + 8, "lshift") & 1)
            {
                return 121;
            }
            else if (sub_1935c(a0 + 8, "rshift") & 1)
            {
                return 122;
            }
            else if (sub_1935c(a0 + 8, "arshift") & 1)
            {
                return 123;
            }
            else if (sub_1935c(a0 + 8, "lrotate") & 1)
            {
                return 124;
            }
            else if (sub_1935c(a0 + 8, "rrotate") & 1)
            {
                return 125;
            }
            else if (sub_1935c(a0 + 8, "countrz") & 1)
            {
                return 128;
            }
            else if (sub_1935c(a0 + 8, "countlz") & 1)
            {
                return 129;
            }
            else if (sub_1935c(a0 + 8, "extract") & 1)
            {
                return 126;
            }
            else if (sub_1935c(a0 + 8, "tonumber") & 1)
            {
                return 95;
            }
        }
        if (!*(long long *)(a1 + 24))
        {
            return 0xffffffff;
        }
        else if (*(long long *)(a1 + 16))
        {
            if (sub_364dc(a0) & 1)
                return 54;
            return 0xffffffff;
        }
        else
        {
            if (sub_36464(a0, *(long long *)(a1 + 24)) & 1)
                return 54;
            return 0xffffffff;
        }
    }
}
